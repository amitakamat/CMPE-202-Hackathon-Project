import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayTransactionMessageState extends ConcreteState
{

  public DisplayTransactionMessageState(GasPumpMachine gasPumpMachine) {
      super(gasPumpMachine);
      stateName = "DisplayTransactionMessageState";
  }


  public String toString() {
    return "Waiting to pump fuel";
  }
}