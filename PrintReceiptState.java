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

        if(id.equals("7") || id.equals("yes"))
        {
            //System.out.println("hello sid");
             String s=String.valueOf(gpm.fuelCost);
            Receipt receipt1=new Receipt();
            Receipt receipt2=new Receipt();
            receipt1.setText(s);
           System.out.println(gpm.fuelCost);

            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            world.addObject(receipt2,600,450);
            world.addObject(receipt1,600,450);
            return gasPumpMachine.getState();
        }
        if (id.equals("8") || id.equals("no"))
        { 
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