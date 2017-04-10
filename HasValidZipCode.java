import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasValidZipCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidZipCode implements State 
{
    private String stateName = "HasValidZipCode";
    GasPumpMachine gasPumpMachine;

    public HasValidZipCode(GasPumpMachine gasPumpMachine) 
    {
        this.gasPumpMachine = gasPumpMachine;
    }
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "8")
        {
            return new HasNoCreditCardState(this.gasPumpMachine);
        }
        
        if(id == "7")
        {
            //TODO
            //Display HELP information
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

}