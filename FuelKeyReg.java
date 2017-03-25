import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuelKeyReg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelKeyReg extends Actor
{
    //Screen screen;
   // public FuelKeyReg(String id)
    //{
    //  this.id = id;
    //  GreenfootImage image = getImage() ;
    //  image.scale( 120, 120) ;
      
   // }
   public FuelKeyReg()
    {
      GreenfootImage image = getImage() ;
      image.scale( 120,120) ;
    }
   
    public void act() 
    {
       if (Greenfoot.mousePressed(this))
        {
            super.act();
            Greenfoot.delay(100);
            MyWorld world = (MyWorld)getWorld();            
            State fuel = world.fuel.onFuelTypeClick();
            if(fuel != null){
                world.fuel = fuel;
                Screen screen = world.getObjects(Screen.class).get(0); 
                
                if(world.fuel.getStateName() == "HasRegularFuelType"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasRegularFuelTypeScreen(); 
                }
            }
        }
    }      
}
