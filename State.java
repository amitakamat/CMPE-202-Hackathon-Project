/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface State
{
    public String getStateName();
    public State onDisplayButtonPress(String id);
    public State onKeypadButtonPress(String id);
    public State onNozzleDrag();
    public State onCreditCardSwipe(String cardType);
    public State onFuelTypeClick();
    public void insertCreditCard();
    public void enterPinCode(String pin);
    
    //public String getStateFuelName();
    //public State onFuelButtonPress(String id);
    //public State onFuelTypeClick();

}