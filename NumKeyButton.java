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

    GreenfootImage gi;
    //ScreenMessages screenmsgs = new ScreenMessages();

    public NumKeyButton(String id, String imagePath)
    {
        this.id = id;
        gi = new GreenfootImage(imagePath);
        setImage(gi);
        gi.scale( 50, 50) ;
    }

    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            super.act();
            MyWorld world = (MyWorld)getWorld();
            Screen screen=world.getScreen();
            GasPumpMachine  gpm = world.getGasPumpMachine();
            if(this.id.equals("cancel"))
                {                    
                    super.submit(this.id);                   
                }
            if(gpm.getState().getStateName()=="HasValidCreditCard")
            {
                if(this.id=="enter"){                   
                    super.submit(this.id);                     
                }
                else if(this.id.equals("help"))
                {
                    super.submit(this.id);
                }
                else if(this.id.equals("yes"))
                {
                    super.submit(this.id);
                }
                else if(this.id.equals("no"))
                {
                    super.submit(this.id);
                }
                else{
                    screen.displayNumber(this.id);
                }

            }//screen = world.getScreen();
            else
            {
                Greenfoot.playSound("beep.wav");
            }
            //screen.DisplayScreen("NumKey " + this.id + " clicked",220,200);
        }
    }
}