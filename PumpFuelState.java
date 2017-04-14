import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PumpFuelState extends ConcreteState
{
  public PumpFuelState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "PumpFuelState";
   }
       
  public State onNozzleDrag(){
            gasPumpMachine.setState(gasPumpMachine.getNozzleUnlockState());
            return gasPumpMachine.getState();
       //return new NozzleUnlockState(this.gasPumpMachine);
  }
    
  public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }

  public void  pressA(){
        
         }
    
  public void  pressB(){
        
        }
        
  public void  pressC(){
                 }

  public String toString() {
    return "PumpFuelState";
  }
}