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
    public State onCreditCardClick();
    public State onFuelTypeClick();
    public State onUnFuelTypeClick();
    public State onPrmFuelTypeClick();
    
    //public String getStateFuelName();
    //public State onFuelButtonPress(String id);
    //public State onFuelTypeClick();

}