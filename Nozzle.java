import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
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
    Screen fueldisplay;
    FuelType fueltype;
    ScreenButton button;
    String bid;
    long startTime,endTime;
    private boolean isGrabbed;
    boolean startTimeSet = false;
 //   String fuelid;
    String id;
     public Nozzle()
    {
        
      GreenfootImage image = getImage() ;
      image.scale( 350,520) ;
    }
    
    public void act() 
    {
        int mouseX, mouseY;
            MyWorld world = (MyWorld)getWorld();   
            GasPumpMachine gpm = world.getGasPumpMachine();
            ScreenMessages screenMessages = new ScreenMessages(world);
            State s = gpm.getState();
            if(s.getClass().getName().equals("PumpFuelState"))
            {
               if(Greenfoot.mouseDragged(this)){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                mouseX = mouse.getX();
                mouseY = mouse.getY();
                setLocation(mouseX,mouseY);
                if(!startTimeSet)
                    startTime = System.nanoTime();
                System.out.println("start:"+startTime);
                FuelDispense();
                }
                
              if(Greenfoot.mouseDragEnded(this))
              {
               super.act();
               endTime = System.nanoTime();
              System.out.println("end:"+endTime);
              long elapsedTime = endTime - startTime;
              System.out.println(elapsedTime/1000000000.0); 
              State s1 = gpm.getState().onNozzleDrag();
              System.out.println(gpm.getState());
              if(s1 != null)
              {
                //gpm.setState(gpm.getNozzleUnlockState());
                  if(s1.getClass().getName().equals("NozzleUnlockState")){
                   
                        FuelCalculate1();
                  }
                         
        
              }       
             }
                
            }            
    //if(Greenfoot.mouseDragged(this) && Greenfoot.mouseDragEnded(this))

}
    
    public void FuelDispense(){
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
            //generate random number 1-20 units of fuel added.
        gpm.calculateFuelCost(new Random().nextInt(15)+1);
        gasPumpingCost.setText("Please pay " +  "$" + gpm.fuelCost );
        // setImage( new GreenfootImage("cost"+ fuelCost, 30,null,null));
        //gasPumpingCost.setText("Cost Calculation");
        fueldisplay.DisplayScreen(gasPumpingCost,280,25, true);
      
   
        ScreenMessages screenMessages = new ScreenMessages(world);
        screenMessages.printReceipt();
        gpm.setState(gpm.getPrintReceiptState());
        
        
      
    }    
    
    public void PromptReceipt(){        
    MyWorld world = (MyWorld)getWorld();
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingDone = new DisplayMessage();
        gasPumpingDone.setText("Done");
        fueldisplay.DisplayScreen(gasPumpingDone,290,25, true);
    }
   
}