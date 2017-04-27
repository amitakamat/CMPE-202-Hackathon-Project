import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
     
  GreenfootImage image;
    
    double units = 5;
    private boolean hasCarWash;
    private double fuelUnitCost = 1.0;
    public double fuelCost; 
    protected double unitCost;
    FuelDisplay fueldisplay;
    FuelType fueltype;
    ScreenButton button;
    String bid;
    long startTime,endTime;
    private boolean isGrabbed;
    boolean startTimeSet = false;
    boolean isPumping = false;
    double fuelQuantity = 0.000;
    String id;
    
    public Nozzle()
    {
        
      GreenfootImage image = getImage() ;
      image.scale( 200,420) ;
    }
    
    public void act() 
    {
        int mouseX, mouseY;
            MyWorld world = (MyWorld)getWorld();   
            GasPumpMachine gpm = world.getGasPumpMachine();
            ScreenMessages screenMessages = new ScreenMessages(world);
            State s = gpm.getState();
            String name = s.getClass().getName();
            Thread costCalThread = null ;//= new Thread(new CostCalculator(gpm, screenMessages));
            if(name.equals("PumpFuelState") || name.equals("NozzleUnlockState"))
            {
                if(Greenfoot.mouseDragged(this)){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                mouseX = mouse.getX();
                mouseY = mouse.getY();
                setLocation(mouseX,mouseY);
                /*if(!startTimeSet)
                    startTime = System.nanoTime();
                System.out.println("start:"+startTime);
                FuelDispense();*/
                }
                
                if(Greenfoot.mouseDragEnded(this))
                {
                  Car car = (Car)getOneIntersectingObject(Car.class);
                  if(car != null)
                  {
                      if(!gpm.getFuellingFlag())
                      {
                          gpm.FuellingFlagLocked = true;
                          gpm.setFuellingFlag(true);
                          gpm.FuellingFlagLocked = false;
                          State s1 = gpm.getState();
                          if(!s1.getStateName().equals("NozzleUnlockState")){
                              s1 = gpm.getState().onNozzleDrag();
                            }
                          //System.out.println(gpm.getState());
                          if(s1 != null)
                          {
                            //gpm.setState(gpm.getNozzleUnlockState());
                              if(s1.getClass().getName().equals("NozzleUnlockState"))
                              {
                                  if(costCalThread == null)
                                  {
                                      costCalThread = new Thread(new CostCalculator(gpm, screenMessages));
                                  }
                                  costCalThread.start();
                              }
                          } 
                      }
                    }
                    else
                    {
                        gpm.FuellingFlagLocked = true;
                        gpm.setFuellingFlag(false);
                        gpm.FuellingFlagLocked = false;
                        if(costCalThread != null)
                        {
                            costCalThread.stop();
                        }
                    }
                  NozzleHolder nHolder = (NozzleHolder)getOneIntersectingObject(NozzleHolder.class); 
                  if(nHolder != null)
                  {
                      if(gpm.getState().getStateName().equals("NozzleUnlockState")){
                          gpm.FuellingFlagLocked = true;
                          gpm.setFuellingFlag(false);
                          gpm.FuellingFlagLocked = false;
                          FuelCalculate1();
                          //gpm.setState(gpm.getTransactionSummaryState());
                          //screenMessages.DisplayCostMessage(gpm.getTotalCost());
                      }
                  }            
              } 
            }            
    //if(Greenfoot.mouseDragged(this) && Greenfoot.mouseDragEnded(this))

    }
    
    public void FuelDispense()
    {
        MyWorld world = (MyWorld)getWorld();
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingMessage = new DisplayMessage();
        gasPumpingMessage.setText("gas pumping");
        fueldisplay.DisplayScreen(gasPumpingMessage,290,25, true);
        //FuelCalculate();
    }
    
    public void FuelCalculate1(){
        MyWorld world = (MyWorld)getWorld();
        //Screen screen = world.getScreen();
        
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingCost = new DisplayMessage();
        //DisplayMessage printDisplay = new DisplayMessage();
        
       
        GasPumpMachine gpm = world.getGasPumpMachine();
        String scenario = gpm.getScenario();
            //generate random number 1-20 units of fuel added.
        //gpm.calculateFuelCost(new Random().nextInt(15)+1);
        /*if(scenario.equals("2") && gpm.getHasCarWash())
        {
            gpm.fuelCost = gpm.fuelCost*0.90;
            gasPumpingCost.setText("Please pay " + "$" + gpm.fuelCost );
        }
        else
        {
            gasPumpingCost.setText("Please pay " + "$" + gpm.fuelCost );
        }*/

        //fueldisplay.DisplayScreen(gasPumpingCost,280,25, true);
      
        //gpm.setFuelCost(gpm.fuelCost);
        gpm.checkAndCalculateForCarWash();
        ScreenMessages screenMessages = new ScreenMessages(world);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        String s=String.valueOf(df.format(gpm.getTotalCost()));
        Receipt receipt1=new Receipt();
        //Receipt receipt2=new Receipt();
        if(scenario.equals("2") && gpm.getHasCarWash())
        {
            //gpm.setState(gpm.getPrintReceiptState());
            receipt1.setText("Total Cost : $" + s+"\n\nCar Wash\nCode\n"+UUID.randomUUID().toString().replace("-","").substring(0,6));
            gpm.setState(gpm.getRemoveCreditCardState());
           // world.addObject(receipt2,600,450);
            world.addObject(receipt1,600,500);
            screenMessages.getRemoveCreditCardScreen();
            Greenfoot.delay(500);
            screenMessages.getNoCreditCardScreen();
            gpm.setState(gpm.getHasNoCreditCardState());
            fueldisplay.ClearTransaction();
            gpm.setFuelQuantity(0.00);
            gpm.setTotalCost(0.00);
            world.removeObject(receipt1);
        }
        else if(scenario.equals("2") && !gpm.getHasCarWash())
        {
            receipt1.setText("Total Cost : $" + s);
            gpm.setState(gpm.getRemoveCreditCardState());
           // world.addObject(receipt2,600,450);
            world.addObject(receipt1,600,450);
            screenMessages.getRemoveCreditCardScreen();
            Greenfoot.delay(500);
            screenMessages.getNoCreditCardScreen();
            gpm.setState(gpm.getHasNoCreditCardState());
            fueldisplay.ClearTransaction();
            gpm.setFuelQuantity(0.00);
            gpm.setTotalCost(0.00);
            world.removeObject(receipt1);
        }
        if(scenario.equals("3") && gpm.getPrintReceiptInAdvance())
        {
            receipt1.setText("Total Cost : $" + s);
            gpm.setState(gpm.getRemoveCreditCardState());
           // world.addObject(receipt2,600,450);
            world.addObject(receipt1,600,450);
            screenMessages.getRemoveCreditCardScreen();
            Greenfoot.delay(500);
            //world.removeObject(receipt2);
            world.removeObject(receipt1);
            screenMessages.getNoCreditCardScreen();
            gpm.setState(gpm.getHasNoCreditCardState());
            fueldisplay.ClearTransaction();
            gpm.setFuelQuantity(0.00);
            gpm.setTotalCost(0.00);
        }
        
        if(scenario.equals("3") && !gpm.getPrintReceiptInAdvance())
        {
            gpm.setState(gpm.getRemoveCreditCardState());
            screenMessages.getRemoveCreditCardScreen();
            Greenfoot.delay(400);
            screenMessages.getNoCreditCardScreen();
            gpm.setState(gpm.getHasNoCreditCardState());
            fueldisplay.ClearTransaction();
            gpm.setFuelQuantity(0.00);
            gpm.setTotalCost(0.00);
            world.removeObject(receipt1);
        }
        
        else if(scenario.equals("1"))
        {
            screenMessages.printReceipt();
            gpm.setState(gpm.getPrintReceiptState());
        }
    }    
    
    public void PromptReceipt()
    {        
        MyWorld world = (MyWorld)getWorld();
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingDone = new DisplayMessage();
        gasPumpingDone.setText("Done");
        fueldisplay.DisplayScreen(gasPumpingDone,290,25, true);
    }
   
}