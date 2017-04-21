import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasValidCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidCreditCardState extends ConcreteState 
{
    String enteredpin="";
    String PIN = "00000";

    public HasValidCreditCardState(GasPumpMachine gpm) 
    {
        super(gpm);
        stateName = "HasValidCreditCard";
    }

    public State onDisplayButtonPress(String id){

        if(id.equals("7")|| id.equals("enter"))
        {
            if(validatezipcode())
            {
                gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
                return gasPumpMachine.getState();
            }
            else{
                gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
                return gasPumpMachine.getState();
            }
        }
        if (id == "8")
        {
            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            return gasPumpMachine.getState();
        }

        return null;
    }

    public State onNumberButtonPress(String id){
        return null;
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
        return "Selecting fuel type";
    }
}