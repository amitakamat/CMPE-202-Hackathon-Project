/**
 * Write a description of class HasNoValidFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoValidFuelType  implements State
{
    // instance variables - replace the example below with your own
    // instance variables - replace the example below with your own
    private String stateName = "HasNoValidFuelType";
    
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
        return null;
    }
    
    public State onFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
  
    
    public void insertCreditCard()
	{
	}
	
    public void enterPinCode(String pin)
	{
	}

}
