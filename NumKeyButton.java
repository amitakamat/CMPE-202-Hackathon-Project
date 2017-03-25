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
    Screen screen;
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
            //screen = world.getScreen();
            //screen.DisplayScreen("NumKey " + this.id + " clicked",220,200);
        }
        }
}