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
    int InvalidEntryCounter=0;
    boolean MaxInvalidEntry ;

    public HasValidCreditCardState(GasPumpMachine gpm) 
    {
        super(gpm);
        stateName = "HasValidCreditCard";
        MaxInvalidEntry = false;;
    }

    public State onDisplayButtonPress(String id){    

        if(id.equals("7")|| id.equals("enter")||id.equals("yes"))
        {
            if(validatezipcode())
            {
                this.enteredpin = "";
                gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
                return gasPumpMachine.getState();
            }
            else{
                // gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
                if(InvalidEntryCounter<3){
                    return gasPumpMachine.getState();
                }
                else {
                    MaxInvalidEntry = true;
                    gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
                    InvalidEntryCounter=0;
                    return gasPumpMachine.getState();
                }

            }
        }
        if (id.equals("8") || id.equals("cancel")||id.equals("no"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
            return gasPumpMachine.getState();
        }
        return null;
    }

    public boolean IsMaxInvalidAttemptsReached(){
        return this.MaxInvalidEntry;
    }
    
    public void MasterReset(){
        this.MaxInvalidEntry=false;
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
        else  {
            InvalidEntryCounter++;
            return false;
        }
    }

    public String toString() {
        return "Enter Pin Code";
    }
}