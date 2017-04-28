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

        if(id.equals("7") || id.equals("help"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHelpState());
            return gasPumpMachine.getState();
        }
        if (id.equals("8") || id.equals("cancel"))
        {          
            gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
            return gasPumpMachine.getState();
        }
        return null;
    }
    
    public State onFuelTypeClick(){
            gasPumpMachine.setState(gasPumpMachine.getHasFuelState());
            return gasPumpMachine.getState();        
    }
}
