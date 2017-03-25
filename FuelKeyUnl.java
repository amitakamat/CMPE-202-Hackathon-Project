import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuelKeyUnl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelKeyUnl extends Actor 
{
   
    public FuelKeyUnl()
    {
      GreenfootImage image = getImage() ;
      image.scale( 120,120) ;
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            super.act();
            Greenfoot.delay(200);
            MyWorld world = (MyWorld)getWorld();            
            State fuelu = world.fuelu.onUnFuelTypeClick();
          
            if(fuelu != null){
               world.fuelu = fuelu;
                Screen screen = world.getObjects(Screen.class).get(0); 
                
                if(world.fuelu.getStateName() == "HasUnFuelType"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasUnleadedFuelTypeScreen(); 
                }
            }
        }
    }            
}
