import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReader extends Actor
{
    private boolean haveCard = false;
     public CardReader()
    {
      GreenfootImage image = getImage() ;
      image.scale( 60,140) ;
    }
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
        Actor card = (CreditCard) getOneObjectAtOffset(0,0,CreditCard.class);
        Actor tempCard  = card;
        if (card!= null) {
            //System.out.println(coin.getClass().getName());
            world.removeObject(card);
            haveCard = true;
        }
       if (haveCard)
        {
            GasPumpMachine gasPumpMachine = new GasPumpMachine(100.0f);
            Greenfoot.playSound("CreditCardSwipe.mp3");
            Greenfoot.delay(200);

            State state = world.state.onCreditCardClick();
            if(state != null){
                world.state = state;
                Screen screen = world.getObjects(Screen.class).get(0); 
                
                if(world.state.getStateName() == "HasValidCreditCard"){
                    ScreenMessages screenMessages = new ScreenMessages(world);
                    screenMessages.getHasValidCreditCardScreen();
                }
            }
            haveCard = false;
        }
    }      
}
