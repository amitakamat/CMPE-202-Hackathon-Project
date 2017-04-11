import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class NumKeyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumKeyButton extends Button
{
    //Screen screen;
    
     
            
     
   //ScreenMessages screenmsgs = new ScreenMessages();
            
    public NumKeyButton(String id)
    {
      this.id = id;
      GreenfootImage image = getImage() ;
      image.scale( 50, 50) ;
      
    }
    public void act() 
    {
       if (Greenfoot.mousePressed(this))
        {
            super.act();
               MyWorld world = (MyWorld)getWorld();
     ScreenMessages screenMessages = new ScreenMessages(world);
     GasPumpMachine  gaspump = world.getGasPumpMachine();
            if(gaspump.getState().getStateName()=="HasValidCreditCard"){                  
                screenMessages.DisplayZipcodeEntered(this.id);
            }//screen = world.getScreen();
            //screen.DisplayScreen("NumKey " + this.id + " clicked",220,200);
        }
    }
}