import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NozzleUnlockState extends ConcreteState
{

  public NozzleUnlockState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "NozzleUnlockState";
  }
    
  //public State onCreditCardSwipe(String cardType){
   //     return new HasValidCreditCardState(this.gasPumpMachine);
  //}

  public String toString() {
    return "NozzleUnlockState";
  }
}