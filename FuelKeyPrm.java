import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuelKeyPrm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelKeyPrm extends Actor
{
   
    public FuelKeyPrm()
    {
      GreenfootImage image = getImage() ;
      image.scale( 120, 120) ;
      
    }
    public void act() 
    {
        //use this logic when the state reaches fuel Menu
        /*
       if (Greenfoot.mousePressed(this))
        {
            super.act();
            Greenfoot.delay(200);
            MyWorld world = (MyWorld)getWorld();            
            //State fuelp = world.fuelp.onPrmFuelTypeClick();
            State fuelp = world.fuelp.onPrmFuelTypeClick();
            if(fuelp != null){
                world.fuelp = fuelp;
                Screen screen = world.getObjects(Screen.class).get(0); 
                
                if(world.fuelp.getStateName() == "HasPrmFuelType"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasPrmFuelTypeScreen(); 
                }
            }
        }
        */
    }      
}
