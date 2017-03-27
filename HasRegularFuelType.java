/**
 * Write a description of class HasRegularFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasRegularFuelType implements State 
{
    private String stateName = "HasRegularFuelType";
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            return new HasRegularFuelType();
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
    public void enterPinCode()
	{
	}

}
