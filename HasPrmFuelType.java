/**
 * Write a description of class HasPrmFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasPrmFuelType implements State
{
    private String stateName = "HasPrmFuelType";
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            return new HasPrmFuelType();
        }
            
        if (id == "8")
        {
            return new HasNoValidFuelType();
        }
            
        return null;
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardClick(){
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
    public void enterPinCode()
	{
	}
    public void proceedWithTransaction()
	{
	}
    public void cancelTransaction()
	{
	}
    public void pumpFuel()
	{
	// Implementation here
	}
}
