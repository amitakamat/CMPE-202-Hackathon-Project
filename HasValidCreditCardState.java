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
                this.enteredpin = "";
                gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
                return gasPumpMachine.getState();
            }
            else{
                gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
                return gasPumpMachine.getState();
            }
        }
        if (id.equals("8") || id.equals("cancel"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
            return gasPumpMachine.getState();
        }
        return null;
    }

    public State onNumberButtonPress(String id){
        return null;
    }

    public void enterPinCode(String pin)
    {
        this.enteredpin= pin;
    }

    public boolean validatezipcode(){
        if(this.PIN.equals(this.enteredpin)){
            this.enteredpin = "";
            return true;
        }
        else  return false;
    }

    public String toString() {
        return "Enter Pin Code";
    }
}