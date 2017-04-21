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
            super.submit(this.id);

        }
    }
}
