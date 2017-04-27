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
    int count=0;

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
               for(int i=0; i<messages.size(); i++)
               {
                   if(messages.get(i).getID().equals(""))
                   {
                       world.removeObject(messages.get(i));
                   }
               }
               //world.removeObjects(messages);
           }
       }
        world.addObject(msg,x,y);

    }

    public void displayNumber(String num){

        if(num=="clear"){
            count= count-1;
            this.number = this.number.substring(0,number.length()-1);
            msg.setText(this.number);
            DisplayScreen(msg, 230, 310, false);   
        }
        else 
        {            
            if(count<5){
                count++;    
                this.number = this.number + num;
                msg.setText(this.number);
                DisplayScreen(msg, 230, 310, false);  
                if(count==5){
                    GasPumpMachine gpm = world.getGasPumpMachine();
                    gpm.setEnteredZip(this.number);
                    this.number="";
                }
            }
            else
            {
                msg.setText("invalid pin enter again" );
                DisplayScreen(msg, 230, 310, false);
                ResetZip();
            }
        }
    }

    public void ResetZip(){
        this.number = "";
        this. count = 0;
    }

    public void act() 
    {
        // Add your action code here.
    }    
}