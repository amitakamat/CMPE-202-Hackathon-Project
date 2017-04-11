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
    public State onNumberButtonPress();
    public State onNozzleClick();
    public State onCreditCardSwipe(String cardType);
    public State onFuelTypeClick();
    public State onUnFuelTypeClick();
    public State onPrmFuelTypeClick();
    
    
      public void insertCreditCard();
      public void enterPinCode(String pin);

    //public String getStateFuelName();
    //public State onFuelButtonPress(String id);
    //public State onFuelTypeClick();

}