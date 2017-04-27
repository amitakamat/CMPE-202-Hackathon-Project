import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptState extends ConcreteState
{

MyWorld world;
GasPumpMachine gpm;

  public PrintReceiptState(GasPumpMachine gasPumpMachine, MyWorld w) {
     
    super(gasPumpMachine);
    gpm = gasPumpMachine;
    world=w;
    stateName = "PrintReceiptState";
  }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }

  public String toString() {
    return "PrintReceiptState";
  }
}