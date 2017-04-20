import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenMessages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenMessages extends Actor
{
     
    
    Screen screen ;
    Nozzle nozzle;
    static String num = "";
    
    public ScreenMessages(MyWorld world){
         
        screen = world.getScreen();
        //screen = world.getObjects(Screen.class).get(0);
        
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

    public void getRemoveCreditCardScreen() 
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please take your card.");
        screen.DisplayScreen(welcomeMessage1, 230, 160, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("Thank you!Visit again.");
        screen.DisplayScreen(welcomeMessage2, 240, 190, false);
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
        screen.DisplayScreen(zipCode1, 230, 160, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Zip Code");
        screen.DisplayScreen(zipCode2, 260, 190, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("Submit >>");
        screen.DisplayScreen(submitMessage, 360, 250, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Cancel >>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);
    }

    public void getHasInValidCreditCardScreen()
    {
        DisplayMessage zipCode1 = new DisplayMessage();
        zipCode1.setText("Please enter a valid");
        screen.DisplayScreen(zipCode1, 230, 160, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Credit Card!");
        screen.DisplayScreen(zipCode2, 250, 190, false);
    }

    public void getInsertingCreditCardAgainScreen()
    {
        DisplayMessage zipCode1 = new DisplayMessage();
        zipCode1.setText("You have already");
        screen.DisplayScreen(zipCode1, 230, 160, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Inserted a Credit Card!!");
        screen.DisplayScreen(zipCode2, 220, 190, false);
    }
    
    public void getHasValidZipCodeScreen()
    {
        DisplayMessage selectMessage1 = new DisplayMessage();
        selectMessage1.setText("      Please select a");
        screen.DisplayScreen(selectMessage1, 230, 160, true);
        
        DisplayMessage selectMessage2 = new DisplayMessage();
        selectMessage2.setText("  Fuel Type");
        screen.DisplayScreen(selectMessage2, 260, 190, false);
        
        DisplayMessage helpMessage = new DisplayMessage();
        helpMessage.setText("Help >>");
        screen.DisplayScreen(helpMessage, 360, 250, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Cancel >>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);
    }
    
     public void getHasRegularFuelTypeScreen()
    {
        DisplayMessage unfuelMsg1 = new DisplayMessage();
        unfuelMsg1.setText("Price of Regular fuel");
        screen.DisplayScreen(unfuelMsg1, 230, 160, true);
        
        DisplayMessage unfuelMsg2 = new DisplayMessage();
        unfuelMsg2.setText("2.929");
        screen.DisplayScreen(unfuelMsg2, 260, 190, false);
        
        DisplayMessage unyesMessage = new DisplayMessage();
        unyesMessage.setText("Continue >>");
        screen.DisplayScreen(unyesMessage, 360, 250, false);

        DisplayMessage unnoMessage = new DisplayMessage();
        unnoMessage.setText("Cancel >>");
        screen.DisplayScreen(unnoMessage, 360, 310, false);
   }
   
   public void getHasUnleadedFuelTypeScreen()
    {
        DisplayMessage fuelMsg1 = new DisplayMessage();
        fuelMsg1.setText("Price of Unleaded fuel");
        screen.DisplayScreen(fuelMsg1, 230, 160, true);
        
        DisplayMessage fuelMsg2 = new DisplayMessage();
        fuelMsg2.setText("3.129");
        screen.DisplayScreen(fuelMsg2, 260, 190, false);
        
        DisplayMessage yesMessage = new DisplayMessage();
        yesMessage.setText("Continue >>");
        screen.DisplayScreen(yesMessage, 360, 250, false);

        DisplayMessage noMessage = new DisplayMessage();
        noMessage.setText("Cancel >>");
        screen.DisplayScreen(noMessage, 360, 310, false);
   }
   
   public void getHasPrmFuelTypeScreen()
    {
        DisplayMessage prfuelMsg1 = new DisplayMessage();
        prfuelMsg1.setText("Price of Premium fuel");
        screen.DisplayScreen(prfuelMsg1, 230, 160, true);
        
        DisplayMessage prfuelMsg2 = new DisplayMessage();
        prfuelMsg2.setText("3.329");
        screen.DisplayScreen(prfuelMsg2, 260, 190, false);
        
        DisplayMessage pryesMessage = new DisplayMessage();
        pryesMessage.setText("Continue >>");
        screen.DisplayScreen(pryesMessage, 360, 250, false);

        DisplayMessage prnoMessage = new DisplayMessage();
        prnoMessage.setText("Cancel >>");
        screen.DisplayScreen(prnoMessage, 360, 310, false);
   }
   
   public void getBeginFueling()
   {
       DisplayMessage beginMessage1 = new DisplayMessage();
       beginMessage1.setText("Please remove nozzle");
       screen.DisplayScreen(beginMessage1, 230, 160, true);
        
        DisplayMessage beginMessage2 = new DisplayMessage();
        beginMessage2.setText("and begin fueling now");
        screen.DisplayScreen(beginMessage2, 230, 190, false);
        
       DisplayMessage nozzleImage = new DisplayMessage("nozzle-screen.png");
       screen.DisplayScreen(nozzleImage, 280, 250, false);
   }
   
   public void getCost()
   {
       DisplayMessage beginMessage2 = new DisplayMessage();
       beginMessage2.setText("final cost is" + nozzle.fuelCost);
       screen.DisplayScreen(beginMessage2, 230, 160, true);
       // nozzle.FuelCalculate1(); 
   }
   public void DisplayZipcodeEntered(String id){
       screen.displayNumber(id);
    }
     public void printReceipt()
    {
        DisplayMessage receipt = new DisplayMessage();
        receipt.setText("Do you want to print your reeipt");
        screen.DisplayScreen(receipt, 230, 160, false);
        
       // DisplayMessage zipCode2 = new DisplayMessage();
        //zipCode2.setText("Zip Code");
        //screen.DisplayScreen(zipCode2, 260, 190, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("yes>>");
        screen.DisplayScreen(submitMessage, 360, 250, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Cancel >>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);
    }
    
    
}
