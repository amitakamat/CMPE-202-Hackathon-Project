import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayMessage extends Actor
{GreenfootImage gi;
    public DisplayMessage()
    {
        gi = new GreenfootImage(250,120);
        setImage(gi);
    }
    
    public void setText(String msg)
    {
        gi.clear();
        gi.setColor(Color.BLACK);
        gi.drawString(msg,130,70);
    }
    
    public void act() 
    {
    } 
}