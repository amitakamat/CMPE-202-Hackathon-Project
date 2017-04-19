import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptState extends ConcreteState
{



  public PrintReceiptState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "PrintReceiptState";
  }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }

  public String toString() {
    return "Waiting to pump fuel";
  }
  
  
    
    public State onDisplayButtonPress(String id){

        if(id == "7")
        {
            
           
                gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
                return gasPumpMachine.getState();
           
        }
        if (id == "8")
        {
            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            return gasPumpMachine.getState();
        }
    
        return null;
    }
 
}