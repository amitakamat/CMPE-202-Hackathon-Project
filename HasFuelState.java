/**
 * Write a description of class HasFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasFuelState implements State  
{
    private String stateName = "HasFuelState";
    GasPumpMachine gasPumpMachine;

    /**
     * Constructor for objects of class HasFuelType
     */
    public HasFuelState(GasPumpMachine gasPumpMachine)
    {
        this.gasPumpMachine = gasPumpMachine;
    }

    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            return new PumpFuelState(this.gasPumpMachine);
        }
        if (id == "8")
        {
            return new HasValidZipCode(this.gasPumpMachine);
        }
          
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        //return new PumpFuelState(this.gasPumpMachine);
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
        return null;
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
          return null;
    }
    
    
    
    public void insertCreditCard()
    {
    }
    public void enterPinCode(String pin)
    {
    }
    
}
