import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditCard extends Actor
{
    /**
     * Act - do whatever the CreditCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int mouseX, mouseY;
        if(Greenfoot.mouseDragged(this))
        {
            MyWorld world = (MyWorld)getWorld();
            GasPumpMachine gpm = world.getGasPumpMachine();
            if(gpm.getState().getStateName() != "NozzleUnlockState")
            {
                MouseInfo mouse = Greenfoot.getMouseInfo();
                mouseX = mouse.getX();
                mouseY = mouse.getY();
                setLocation(mouseX,mouseY);
                
                CardReader cr = (CardReader)getOneIntersectingObject(CardReader.class);
                if(cr != null)
                {
                    //MyWorld world = (MyWorld)getWorld();
                    cr.OnCardSwipe(this);
                }
            }
        }
    }    
}
