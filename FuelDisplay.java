import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class FuelDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelDisplay extends Screen
{
    public FuelDisplay(){
       
      GreenfootImage image = getImage() ;
      image.scale(250, 50) ;
    
    }
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void DisplayScreen(DisplayMessage msg,int x,int y, boolean clearScreen)
    {
       world = (MyWorld)getWorld();
       if(clearScreen){
           List<DisplayMessage> messages = world.getObjects(DisplayMessage.class);
           if(messages.size() > 0){
               for(int i=0; i< messages.size(); i++){
                   String id = messages.get(i).getID();
                   if(id.equals("totalCost") || id.equals("fuelQuantity"))
                   { 
                       world.removeObject(messages.get(i));
                   }
               //world.removeObjects(messages);
            }
           }
       }
       world.addObject(msg,x,y);
       
    }
    
    public void ClearTransaction()
    {
       world = (MyWorld)getWorld();
       List<DisplayMessage> messages = world.getObjects(DisplayMessage.class);
       if(messages.size() > 0)
       {
           for(int i=0; i< messages.size(); i++)
           {
               String id = messages.get(i).getID();
               if(id.equals("totalCost") || id.equals("fuelQuantity"))
               { 
                   world.removeObject(messages.get(i));
               }
           }
       }
    }
}