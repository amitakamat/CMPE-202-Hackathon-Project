import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptState extends ConcreteState
{
//MyWorld world = (MyWorld)getWorld();  
 Receipt receipt= new Receipt();

  public PrintReceiptState(GasPumpMachine gasPumpMachine) {
      
    super(gasPumpMachine);
    
    stateName = "PrintReceiptState";
  }
  
  public State onDisplayButtonPress(String id){

        if(id == "7")
        {
            //MyWorld world = getWorld();
          // Receipt receipt=new Receipt();
             //addObject(receipt,300,220);
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