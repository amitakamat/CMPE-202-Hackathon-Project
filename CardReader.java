import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReader extends Actor
{
     public CardReader()
    {
      GreenfootImage image = getImage() ;
      image.scale( 60,140) ;
    }
    public void act() 
    {
       if (Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("CreditCardSwipe.mp3");
            Greenfoot.delay(200);
            MyWorld world = (MyWorld)getWorld();
            State state = world.state.onCreditCardClick();
            if(state != null){
                world.state = state;
                Screen screen = world.getObjects(Screen.class).get(0); 
                
                if(world.state.getStateName() == "HasValidCreditCard"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasValidCreditCardScreen();
                }
            }
        }
    }      
}
