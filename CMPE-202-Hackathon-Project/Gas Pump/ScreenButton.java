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
            State state = world.state.onDisplayButtonPress(this.id);
            if(state != null){
                world.state = state;
                String stateName = world.state.getStateName();
                if(stateName == "HasValidZipCode")
                {
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasValidZipCodeScreen();
                }
                
                if(stateName == "HasNoCreditCard"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getNoCreditCardScreen();
                }
            }
        }
    }
        
}    

