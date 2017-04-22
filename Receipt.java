import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends Actor
{
    /**
     * Act - do whatever the Receipt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Receipt()
    {
      GreenfootImage image=getImage();
      image.scale( 200,200) ;
      //g.drawString(String.valueOf(f), 250,250);
       //setImage(g);
    }

    public void setText(String msg)
    {  setImage(new GreenfootImage(msg,30,greenfoot.Color.BLUE,greenfoot.Color.WHITE));

    }

    
    public void act() 
    {
        // Add your action code here.
    }    
}
