import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    int width;
    int height;
    String id;
        
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("beep.wav");
        }
    }    
}
