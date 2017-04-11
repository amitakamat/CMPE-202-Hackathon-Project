import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoCreditCardState implements State
{
    private String stateName = "HasNoCreditCard";
    GasPumpMachine gasPumpMachine;

  public HasNoCreditCardState(GasPumpMachine gasPumpMachine) {
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
        //System.out.println("In HasNoCreditCardState, on credit card swipe");
        if(cardType.equals("VisaCard") || cardType.equals("MasterCard"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHasValidCreditCardState());
           return gasPumpMachine.getState();
        }
        else if(cardType.equals("FakeCreditCard"))
        {
           gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
           return gasPumpMachine.getState();
        }
        return null;
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
    public void enterPinCode(String pin)
    {
    }


  public String toString() {
    return "Waiting to pump fuel";
  }
}