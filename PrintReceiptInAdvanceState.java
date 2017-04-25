/**
 * Write a description of class PrintReceiptInAdvanceState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptInAdvanceState extends ConcreteState 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PrintReceiptInAdvanceState
     */
    public PrintReceiptInAdvanceState(GasPumpMachine gasPumpMachine)
    {
        super(gasPumpMachine);
        stateName = "PrintReceiptInAdvanceState";
    }
    
    public State onDisplayButtonPress(String id){
        String scenario = gasPumpMachine.getScenario();
        //might need to move help
        if(id.equals("7") || id.equals("help"))
        {
                //set the variable and go to validZipCodeState and continue with fuel selection
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
