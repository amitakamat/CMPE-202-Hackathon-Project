import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoCreditCard implements State
{
    private String stateName = "HasNoCreditCard";
    
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
        return new HasValidCreditCard();
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
}