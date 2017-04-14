import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class DisplayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenButton extends Button
{
    Screen screen;
    
    public ScreenButton(String id)
    {
      this.id = id;
      GreenfootImage image = getImage() ;
      image.scale( 75, 50) ;
    }
    
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            
            super.act();
            MyWorld world = (MyWorld)getWorld();
            GasPumpMachine gpm = world.getGasPumpMachine();
            //System.out.println("In screen button");
            
            
            State state = gpm.onDisplayButtonPress(this.id);

            //StateFuel fuel = world.fuel.onFuelButtonPress(this.id);
            //StateFuel fuel = world.fuel.onFuelButtonPress(this.id);
            if(state != null){
                gpm.setState(state);
                String stateName = gpm.state.getStateName();
                ScreenMessages screenMessages = new ScreenMessages(world);
                
                if(stateName == "HasValidZipCode")
                {
                    screenMessages.getHasValidZipCodeScreen();
                }
                
                if(stateName == "HasNoCreditCard"){
                    screenMessages.getNoCreditCardScreen();
                }
            //if(fuel != null)
            //    world.fuel = fuel;
              //String stateFuelName = world.state.getStateFuelName();
                
                if(stateName == "HasFuelState"){
                    screenMessages.getNoCreditCardScreen();
                }
                
                if(stateName == "PumpFuelState")
                {
                    screenMessages.getBeginFueling();
                }
                
            }
        }
    }
}