import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nine extends NumKeyButton
{
    /**
     * Act - do whatever the nine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nine(String id)
    {
      this.id = id;
      GreenfootImage image = getImage() ;
      image.scale( 50, 50) ;
      
    }
    public void act() 
    {
        super.act();
        // Add your action code here.
    }    
}
