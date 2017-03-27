import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayTransactionMessageState implements State
{
    private String stateName = "HasNoCreditCard";
  GasPumpMachine GasPumpMachine;

  public DisplayTransactionMessageState(GasPumpMachine GasPumpMachine) {
    this.GasPumpMachine = GasPumpMachine;
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
    
    public State onCreditCardClick(){
        return new HasValidCreditCardState();
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
    public State onUnFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    public State onPrmFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public void insertCreditCard()
	{
	}
    public void enterPinCode()
	{
	}
    public void proceedWithTransaction()
	{
	}
    public void cancelTransaction()
	{
	}
    public void pumpFuel()
	{
	// Implementation here
	}

  public String toString() {
    return "Waiting to pump fuel";
  }
}