import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayMessage extends Actor
{
    GreenfootImage gi;
    String id;
    
    public DisplayMessage()
    {
        gi = new GreenfootImage(270,120);
        setImage(gi);
        id = "";
    }
    
    public DisplayMessage(String imagePath)
    {
        gi = new GreenfootImage(imagePath);
        setImage(gi);
        id = "";
    }
    
    public void setID(String ID)
    {
        id = ID;
    }
    
    public String getID()
    {
        return id;
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