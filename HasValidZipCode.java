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
    
    public State onDisplayButtonPress(String id){

        if(id == "7")
        {
            gasPumpMachine.setHasCarWash(true);
            //gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            return gasPumpMachine.getHasCarWashState();
        }
        if (id == "8")
        {
            gasPumpMachine.setHasCarWash(false);
            //gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            return gasPumpMachine.getHasCarWashState();
        }
        return null;
    }
}