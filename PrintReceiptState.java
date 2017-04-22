import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptState extends ConcreteState
{

MyWorld world;
GasPumpMachine gpm;

  public PrintReceiptState(GasPumpMachine gasPumpMachine, MyWorld w) {
     
    super(gasPumpMachine);
    gpm = gasPumpMachine;
   world=w;
    stateName = "PrintReceiptState";
  }
  
  public State onDisplayButtonPress(String id){

        if(id == "7")
        {
            //System.out.println("hello sid");
             String s=String.valueOf(gpm.fuelCost);
            Receipt receipt1=new Receipt();
            Receipt receipt2=new Receipt();
            receipt1.setText(s);
           System.out.println(gpm.fuelCost);
           //setImage(new GreenfootImage(, 20, 
                                   // Color.WHITE, Color.BLACK));
           // world.getBackground().drawString(String.valueOf(gpm.fuelCost), 240, 300);
           //Greenfoot.setWorld(Myworl)
            //world=  getWorldOfTypnew MyWorld();
            //world.addObject(receipt,500,500);
          
           // receipt.setImage(new GreenfootImage(s, 20, 
             //                       Color.WHITE, Color.BLACK));
            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            world.addObject(receipt2,600,450);
            world.addObject(receipt1,600,450);
            return gasPumpMachine.getState();
            //System.out.println("hello sid");
            //gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            //return gasPumpMachine.getState();
            //MyWorld world = getWorld();
          //Receipt receipt=new Receipt();
            // world.addObject(receipt,500,500);
           // getWorld().addObject(receipt, 350,570);
           // ScreenMessages screenMessages = new ScreenMessages(world);
           //DisplayMessage welcomeMessage1 = new DisplayMessage();
        //welcomeMessage1.setText("Hello");
           //screenMessages.DisplayReceipt(welcomeMessage1,400,300);
           //world.addObject(receipt,300,220);
         
           //gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
           // return gasPumpMachine.getState();
           
               
           
        }
        if (id == "8")
        { //System.out.println("hello sid");
            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            return gasPumpMachine.getState();
        }
    
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }

  public String toString() {
    return "PrintReceiptState";
  }
}