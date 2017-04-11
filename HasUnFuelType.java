/**
 * Write a description of class HasUnFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasUnFuelType implements State 
{
    private String stateName = "HasUnFuelType";
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            return new HasUnFuelType();
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
    
    public State onCreditCardSwipe(String cardType){
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

}
