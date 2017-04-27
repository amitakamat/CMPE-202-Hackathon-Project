import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NozzleHolder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NozzleHolder extends Actor
{
   public NozzleHolder()
    {
      GreenfootImage image = getImage() ;
      image.scale( 100,300) ;
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
               super.act();
               MyWorld world = (MyWorld)getWorld();
               ScreenMessages screenMessages = new ScreenMessages(world);
               GasPumpMachine  gpm = world.getGasPumpMachine();
               //gpm.
               if(gpm.getState().getStateName()=="NozzleUnlockState")
               {
                   
               }
        }    
    }   
}
