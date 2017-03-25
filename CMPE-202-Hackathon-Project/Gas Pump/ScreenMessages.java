import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenMessages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenMessages extends Actor
{
    Screen screen;
    public ScreenMessages(World world){
        screen = world.getObjects(Screen.class).get(0);
    }
    
    public void getNoCreditCardScreen() 
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please insert a credit");
        screen.DisplayScreen(welcomeMessage1, 230, 200, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("card to proceed");
        screen.DisplayScreen(welcomeMessage2, 240, 230, false);
    }    
    
    public void getHasValidCreditCardScreen()
    {
        DisplayMessage zipCode1 = new DisplayMessage();
        zipCode1.setText("Please enter a valid");
        screen.DisplayScreen(zipCode1, 230, 200, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Zip Code");
        screen.DisplayScreen(zipCode2, 260, 230, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("Submit >>");
        screen.DisplayScreen(submitMessage, 320, 300, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Cancel >>");
        screen.DisplayScreen(cancelMessage, 320, 350, false);
    }
    
    public void getHasValidZipCodeScreen()
    {
        DisplayMessage selectMessage1 = new DisplayMessage();
        selectMessage1.setText("      Please select a");
        screen.DisplayScreen(selectMessage1, 230, 200, true);
        
        DisplayMessage selectMessage2 = new DisplayMessage();
        selectMessage2.setText("Fuel Type");
        screen.DisplayScreen(selectMessage2, 260, 230, false);
    }
}
