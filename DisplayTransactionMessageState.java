import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayTransactionMessageState implements State
{
    private String stateName = "DisplayTransactionMessageState";
  GasPumpMachine gasPumpMachine;

  public DisplayTransactionMessageState(GasPumpMachine gasPumpMachine) {
    this.gasPumpMachine = gasPumpMachine;
  }
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
        public void insertCreditCard()
	{
	}
    public void enterPinCode(String pin)
	{
	}


  public String toString() {
    return "Waiting to pump fuel";
  }
}