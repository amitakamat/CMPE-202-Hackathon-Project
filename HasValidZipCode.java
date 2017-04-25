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
        String scenario = gasPumpMachine.getScenario();
        //might need to move help
        if(id.equals("7") || id.equals("help") || id.equals("yes"))
        {
            if(scenario.equals("1"))
            {
                //help
            gasPumpMachine.setState(gasPumpMachine.getHelpState());
            return gasPumpMachine.getState();
            }
            else if(scenario.equals("2"))
            { 
            gasPumpMachine.setHasCarWash(true);
            gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            return gasPumpMachine.getState();
            }
            else if(scenario.equals("3"))
            {
                //set the variable and go to validZipCodeState and continue with fuel selection
            gasPumpMachine.setPrintReceiptInAdvance(true);
            gasPumpMachine.setState(gasPumpMachine.getPrintReceiptInAdvanceState());
            return gasPumpMachine.getState();
            }
        }
        
        if (id.equals("8") || id.equals("cancel") || id.equals("no"))
        {
            if(scenario.equals("1"))
            {//cancel
            gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
            return gasPumpMachine.getState();
            }
            else if(scenario.equals("2"))
            { 
            gasPumpMachine.setHasCarWash(false);
            //return gasPumpMachine.getHasCarWashState();
            gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            return gasPumpMachine.getState();
            }
            else if(scenario.equals("3"))
            {
            gasPumpMachine.setPrintReceiptInAdvance(false);
            gasPumpMachine.setState(gasPumpMachine.getPrintReceiptInAdvanceState());
            return gasPumpMachine.getState();
            }            
        }
        return null;
    }
    
    public State onFuelTypeClick(){
            gasPumpMachine.setState(gasPumpMachine.getHasFuelState());
            return gasPumpMachine.getState();        
    }
}