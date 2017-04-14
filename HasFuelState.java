/**
 * Write a description of class HasFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasFuelState extends ConcreteState  
{

    /**
     * Constructor for objects of class HasFuelType
     */
    public HasFuelState(GasPumpMachine gasPumpMachine)
    {
        super(gasPumpMachine);
        stateName = "HasFuelState";
    }

    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            gasPumpMachine.setState(gasPumpMachine.getPumpFuelState());
            return gasPumpMachine.getState();
            //return new PumpFuelState(this.gasPumpMachine);
        }
        if (id == "8")
        {
            gasPumpMachine.setState(gasPumpMachine.getHasValidZipCodeState());
            return gasPumpMachine.getState();
            //return new HasValidZipCode(this.gasPumpMachine);
        }
          
        return null;
    }
    
}
