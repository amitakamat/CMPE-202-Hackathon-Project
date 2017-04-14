import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransactionSummaryState extends ConcreteState
{

  public TransactionSummaryState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "TransactionSummaryState";
  }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }
 
  public String toString() {
    return "Printing transaction summary.";
  }
}