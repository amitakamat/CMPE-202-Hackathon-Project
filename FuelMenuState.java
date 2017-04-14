import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelMenuState extends ConcreteState
{

  public FuelMenuState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "FuelMenuState";
  }
    
  public State onCreditCardSwipe(String cardType){
    return new HasValidCreditCardState(this.gasPumpMachine);
  }
   
  public String toString() {
    return "Selecting fuel";
  }
}