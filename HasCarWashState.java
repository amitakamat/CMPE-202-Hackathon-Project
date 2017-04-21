/**
 * Write a description of class ShowCarWashState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasCarWashState extends ConcreteState 
{
    /**
     * Constructor for objects of class ShowCarWashState
     */
    public HasCarWashState(GasPumpMachine gasPumpMachine)
    {
        super(gasPumpMachine);
        stateName = "HasCarWashState";
    }
    
    public State onDisplayButtonPress(String id){

        if(id == "7")
        {
            //TODO : implement help screen
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
