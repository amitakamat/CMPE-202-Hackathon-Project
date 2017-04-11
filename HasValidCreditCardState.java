import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasValidCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidCreditCardState implements State 
{
    private String stateName = "HasValidCreditCard";
    GasPumpMachine gasPumpMachine;
    String enteredpin="";
    String PIN = "94085";

    public HasValidCreditCardState(GasPumpMachine gasPumpMachine) 
    {
    this.gasPumpMachine = gasPumpMachine;
    }
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            if(validatezipcode()){
               //gasPumpMachine.setState(gasPumpMachine.gethasValidZipCodeState());
               return new HasValidZipCode(this.gasPumpMachine);
        }
        else{
         return new HasNoCreditCardState(this.gasPumpMachine);
        }
    }
        if (id == "8")
        {
            return new HasNoCreditCardState(this.gasPumpMachine);
        }
            
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
        return null;
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
    public State onPrmFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public State onUnFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public void insertCreditCard()
    {
    }
    public void enterPinCode()
    {
        
    }
    public void enterPinCode(String pin)
    {
        enteredpin= pin;
    }
    public boolean validatezipcode(){
    if(this.PIN.equals(this.enteredpin)){
        return true;
    }
   else  return false;
    }


  public String toString() {
    return "Waiting to pump fuel";
  }
}