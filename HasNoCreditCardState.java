import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoCreditCardState extends ConcreteState
{

    public HasNoCreditCardState(GasPumpMachine gasPumpMachine) {
        super(gasPumpMachine);
        stateName = "HasNoCreditCard";
  }

    public State onCreditCardSwipe(String cardType){
        //System.out.println("In HasNoCreditCardState, on credit card swipe");
        if(cardType.equals("VisaCard") || cardType.equals("MasterCard"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHasValidCreditCardState());
           return gasPumpMachine.getState();
        }
        else if(cardType.equals("FakeCreditCard"))
        {
           gasPumpMachine.setState(gasPumpMachine.getRemoveCreditCardState());
           return gasPumpMachine.getState();
        }
        return null;
    }

  public String toString() {
    return "Waiting to pump fuel";
  }
}