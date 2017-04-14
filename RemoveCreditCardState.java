import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveCreditCardState implements State
{
    private String stateName = "HasNoCreditCard";
  GasPumpMachine gasPumpMachine;

  public RemoveCreditCardState(GasPumpMachine gasPumpMachine) {
    this.gasPumpMachine = gasPumpMachine;
  }
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
    public State onUnFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    public State onPrmFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public void insertCreditCard()
	{
	}
    public void enterPinCode(String pin)
	{
	}
 public void  pressA(){
          
        }
    
     public void  pressB(){
        
        }
        
             public void  pressC(){
                }

  public String toString() {
    return "Waiting to pump fuel";
  }
}