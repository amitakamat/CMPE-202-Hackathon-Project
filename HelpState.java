/**
 * Write a description of class HelpState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpState extends ConcreteState 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HelpState
     */
    public HelpState(GasPumpMachine gpm) 
    {
        super(gpm);
        stateName = "HelpState";
    }

    public State onDisplayButtonPress(String id){
        String scenario = gasPumpMachine.getScenario();

        
        if (id == "8")
        {
            if(scenario.equals("1"))
            {
            gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
            return gasPumpMachine.getState();
            }
            else if(scenario.equals("2"))
            { 
            gasPumpMachine.setHasCarWash(false);
            //gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            gasPumpMachine.setState(gasPumpMachine.getHasCarWashState());
            return gasPumpMachine.getState();

            }
            else if(scenario.equals("3"))
            {
            //gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
            gasPumpMachine.setState(gasPumpMachine.getPrintReceiptInAdvanceState());
            return gasPumpMachine.getState();   
            }            
        }
        return null;
    }
}
