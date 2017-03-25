import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasValidZipCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasValidZipCode implements State 
{
    private String stateName = "HasValidZipCode";
    
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
}