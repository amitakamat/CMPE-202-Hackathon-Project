import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveCreditCardState extends ConcreteState
{
    
  public RemoveCreditCardState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "RemoveCreditCardState";
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
    return "RemoveCreditCardState";
  }
}