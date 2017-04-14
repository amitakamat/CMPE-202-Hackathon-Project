import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class FuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelType extends Button
{ 
            
    GreenfootImage gi;
    String fuelid; 
   // "add a method calculate cost here"
   //ScreenMessages screenmsgs = new ScreenMessages();
    private boolean hasCarWash;
    private double fuelUnitCost = 0.0;
    private double fuelCost; 
    protected double unitCost;
    double units;
            
public FuelType(String id, String imagePath)
    {
        this.id = id;
        gi = new GreenfootImage(imagePath);
        setImage(gi);
        gi.scale(100, 100) ;
    }
    public void act() 
    {
       if (Greenfoot.mousePressed(this))
        {
            super.act();
            Greenfoot.delay(100);
            MyWorld world = (MyWorld)getWorld();   
            GasPumpMachine gpm = world.getGasPumpMachine();
            ScreenMessages screenMessages = new ScreenMessages(world);
            State s = gpm.getState().onFuelTypeClick();
            if(s != null){
                gpm.setState(gpm.getHasFuelState());
                //if(s.getClass().getName().equals("HasFuelState"))
                fuelid = this.id;
                switch(fuelid){
                    case "1":
                        
                        screenMessages.getHasRegularFuelTypeScreen();
                        
                        break;
                    case "2":
                        screenMessages.getHasUnleadedFuelTypeScreen();
                        break;
                    case "3":    
                        screenMessages.getHasPrmFuelTypeScreen();
                        break;
                    }
             
        
              }    
        }
 }
 
}
    
