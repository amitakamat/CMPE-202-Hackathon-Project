import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class NumKeyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumKeyButton extends Button
{
    public NumKeyButton(String id)
    {
      GreenfootImage image = getImage() ;
      image.scale( 50, 50) ;
      this.id = id;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            super.act();
            MyWorld world = (MyWorld)getWorld();
            //Screen screen = world.getObjects(Screen.class).get(0);
            //screen.DisplayScreen("Number " + this.id + " clicked",220,200);
        }
    }    
}
