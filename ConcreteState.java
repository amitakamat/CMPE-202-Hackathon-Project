/**
 * Write a description of class ConcreteState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteState implements State 
{
    protected String stateName;
    GasPumpMachine gasPumpMachine;

    /**
     * Constructor for objects of class ConcreteState
     */
    public ConcreteState(GasPumpMachine gpm)
    {
        this.gasPumpMachine = gpm;
    }
    
    public String getStateName(){
        return this.stateName;
    }

    public State onDisplayButtonPress(String id){
        return null;
    }
    
    public State onKeypadButtonPress(String id){
        return null;
    }
    
    public State onNozzleDrag(){
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
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
