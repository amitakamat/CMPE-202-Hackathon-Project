import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasValidZipCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidZipCode extends ConcreteState 
{
    public HasValidZipCode(GasPumpMachine gasPumpMachine) 
    {
        super(gasPumpMachine);
        stateName = "HasValidZipCode";
    }
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){

        if(id == "7")
        {
                //help to do

        }
        if (id == "8")
        {
            gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
            return gasPumpMachine.getState();
        }
        return null;
    }
    
    public State onFuelTypeClick(){
            gasPumpMachine.setState(gasPumpMachine.getHasFuelState());
            return gasPumpMachine.getState();        
        }

}