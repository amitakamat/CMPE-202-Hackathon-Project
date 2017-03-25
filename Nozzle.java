import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nozzle extends Actor
{
       
    int fuel = 0;
    int cost = 0;
    Screen fueldisplay;
     public Nozzle()
    {
      GreenfootImage image = getImage() ;
      image.scale( 350,520) ;
    }
    
    public void act() 
    {
        int mouseX, mouseY;
    
    if(Greenfoot.mouseDragged(this)){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        setLocation(mouseX,mouseY);
        FuelDispense();
    }
        
    if(Greenfoot.mouseDragEnded(this)){
        setLocation(850,380);
            PromptReceipt();
        }
    }    
    
    public void FuelDispense(){
        MyWorld world = (MyWorld)getWorld();
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingMessage = new DisplayMessage();
        gasPumpingMessage.setText("gas pumping");
        fueldisplay.DisplayScreen(gasPumpingMessage,300,75, true);
    }
    
    public void PromptReceipt(){        
    MyWorld world = (MyWorld)getWorld();
        fueldisplay = world.getFuelDisplayScreen();
        DisplayMessage gasPumpingDone = new DisplayMessage();
        gasPumpingDone.setText("Done");
        fueldisplay.DisplayScreen(gasPumpingDone,300,75, true);
    }
    
}