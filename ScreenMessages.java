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
        screen.DisplayScreen(welcomeMessage1, 230, 160, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("card to proceed");
        screen.DisplayScreen(welcomeMessage2, 250, 190, false);
    }    
     public void getHasNoValidFuelTypeScreen() 
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please insert a Valid");
        screen.DisplayScreen(welcomeMessage1, 230, 200, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("Fuel type");
        screen.DisplayScreen(welcomeMessage2, 240, 230, false);
    }    
    
    public void getHasValidCreditCardScreen()
    {
        DisplayMessage zipCode1 = new DisplayMessage();
        zipCode1.setText("Please enter a valid");
        screen.DisplayScreen(zipCode1, 230, 200, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Zip Code");
        screen.DisplayScreen(zipCode2, 240, 230, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("Submit >>");
        screen.DisplayScreen(submitMessage, 360, 240, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Cancel >>");
        screen.DisplayScreen(cancelMessage, 360, 280, false);
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
     public void getHasRegularFuelTypeScreen()
    {
        DisplayMessage unfuelMsg1 = new DisplayMessage();
        unfuelMsg1.setText("Price of Regular fuel");
        screen.DisplayScreen(unfuelMsg1, 230, 200, true);
        
        DisplayMessage unfuelMsg2 = new DisplayMessage();
        unfuelMsg2.setText("2.929");
        screen.DisplayScreen(unfuelMsg2, 260, 230, false);
        
        DisplayMessage unyesMessage = new DisplayMessage();
        unyesMessage.setText("Yes >>");
        screen.DisplayScreen(unyesMessage, 360, 240, false);

        DisplayMessage unnoMessage = new DisplayMessage();
        unnoMessage.setText("No >>");
        screen.DisplayScreen(unnoMessage, 360, 280, false);
   }
   public void getHasUnleadedFuelTypeScreen()
    {
        DisplayMessage fuelMsg1 = new DisplayMessage();
        fuelMsg1.setText("Price of Unleaded fuel");
        screen.DisplayScreen(fuelMsg1, 230, 200, true);
        
        DisplayMessage fuelMsg2 = new DisplayMessage();
        fuelMsg2.setText("3.129");
        screen.DisplayScreen(fuelMsg2, 260, 230, false);
        
        DisplayMessage yesMessage = new DisplayMessage();
        yesMessage.setText("Yes >>");
        screen.DisplayScreen(yesMessage, 360, 240, false);

        DisplayMessage noMessage = new DisplayMessage();
        noMessage.setText("No >>");
        screen.DisplayScreen(noMessage, 360, 280, false);
   }
   public void getHasPrmFuelTypeScreen()
    {
        DisplayMessage prfuelMsg1 = new DisplayMessage();
        prfuelMsg1.setText("Price of Unleaded fuel");
        screen.DisplayScreen(prfuelMsg1, 230, 200, true);
        
        DisplayMessage prfuelMsg2 = new DisplayMessage();
        prfuelMsg2.setText("3.329");
        screen.DisplayScreen(prfuelMsg2, 260, 230, false);
        
        DisplayMessage pryesMessage = new DisplayMessage();
        pryesMessage.setText("Yes >>");
        screen.DisplayScreen(pryesMessage, 360, 240, false);

        DisplayMessage prnoMessage = new DisplayMessage();
        prnoMessage.setText("No >>");
        screen.DisplayScreen(prnoMessage, 360, 280, false);
   }
}
