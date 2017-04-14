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
        GasPumpMachine gpm = world.getGasPumpMachine();
        ScreenMessages screenMessages = new ScreenMessages(world);
        if (card!= null)
        {
            Greenfoot.playSound("CreditCardSwipe.mp3");
            Greenfoot.delay(200);
            State s = gpm.onCreditCardSwipe(card.getClass().getName());
            
            if(s!= null)
            {
                if(s.getClass().getName().equals("HasValidCreditCardState"))
                {
                  world.removeObject(card);
                  screenMessages.getHasValidCreditCardScreen();
                }
                else
                {
                  world.removeObject(card);                  
                  //display message on the screen that a wrong card is inserted        
                  screenMessages.getHasInValidCreditCardScreen();
                }
            }
            else
            {
                //if we are inserting card in wrong state i.e inserting card again
                //then remove card and display message on screen that card cannot be
                //inserted again
                world.removeObject(card);
                //display message 
                  if(card.getClass().getName().equals("VisaCard"))
                     world.addObject(card,730,240);
                  if(card.getClass().getName().equals("MasterCard"))
                     world.addObject(card,730,150);
                  if(card.getClass().getName().equals("FakeCreditCard"))
                     world.addObject(card,740,330);
                screenMessages.getInsertingCreditCardAgainScreen();
                Greenfoot.delay(200);
                screenMessages.getHasValidCreditCardScreen();
            }
            //haveCard = true;
        }
        /*
       if (haveCard)
        {


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
        */
    }      
}
