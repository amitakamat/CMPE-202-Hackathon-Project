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
            //gpm.
            if(gpm.getState().getStateName()=="HasValidCreditCard")
            {
                if(this.id=="enter"){

                    super.submit(this.id);
                }
                else if(this.id!="yes"&&this.id!="no"&&this.id!="help"&&this.id!="cancel"){
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