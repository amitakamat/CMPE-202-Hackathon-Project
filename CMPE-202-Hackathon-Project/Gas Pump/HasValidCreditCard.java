/**
 * Write a description of class HasValidCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidCreditCard implements State 
{
    private String stateName = "HasValidCreditCard";
    
    public String getStateName(){
        return this.stateName;
    }
    
    public State onDisplayButtonPress(String id){
        if(id == "7")
        {
            return new HasValidZipCode();
        }
            
        if (id == "8")
        {
            return new HasNoCreditCard();
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
}
