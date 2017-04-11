import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    GreenfootImage  gi;
    MyWorld world;
    DisplayMessage  msg;
    String number="";
    static int count=0;
    
    public Screen()
    {
      msg = new DisplayMessage();
      GreenfootImage image = getImage() ;
      image.scale( 300, 300) ;
      
    }
    
    public void DisplayScreen(DisplayMessage msg,int x,int y, boolean clearScreen)
    {
       world = (MyWorld)getWorld();
       if(clearScreen){
           List<DisplayMessage> messages = world.getObjects(DisplayMessage.class);
           if(messages.size() > 0){
               world.removeObjects(messages);
           }
       }
       world.addObject(msg,x,y);
       
    }
    
    public void displayNumber(String num){
        number = number + num;
        msg.setText(number);
        count++;
        if(count==4){
        
        }
        
        if(count<5){
        DisplayScreen(msg, 230, 310, false);                    
        }
        
        else{
        number = "";
        count = 0;
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}