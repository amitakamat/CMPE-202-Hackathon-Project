import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
import java.math.RoundingMode;

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
    Screen fuelDisplay;
    static String num = "";
    MyWorld world;  
            
    
    public ScreenMessages(MyWorld world)
    {
        screen = world.getScreen();
        this.world = world;
        fuelDisplay = world.getFuelDisplayScreen();
    }
    
    public void getNoCreditCardScreen() 
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please insert a credit");
        screen.DisplayScreen(welcomeMessage1, 230, 160, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("card to proceed");
        screen.DisplayScreen(welcomeMessage2, 250, 190, false);
        
        world.ReturnCard();
    }    

    public void getRemoveCreditCardScreen() 
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please take your card.");
        screen.DisplayScreen(welcomeMessage1, 210, 160, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("Thank you!Visit again.");
        screen.DisplayScreen(welcomeMessage2, 220, 190, false);
        
        world.ReturnCard();
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
        zipCode1.setText("Please provide a valid");
        screen.DisplayScreen(zipCode1, 230, 160, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText("Credit Card!");
        screen.DisplayScreen(zipCode2, 250, 190, false);
        
        world.ReturnCard();
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
  
    public void printReceipt()
    {
        DisplayMessage receipt = new DisplayMessage();
        receipt.setText("Do you want to print your");
        screen.DisplayScreen(receipt, 230, 160, true);
        
        DisplayMessage zipCode2 = new DisplayMessage();
        zipCode2.setText(" receipt");
        screen.DisplayScreen(zipCode2, 260, 190, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("yes>>");
        screen.DisplayScreen(submitMessage, 360, 250, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("no>>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);
    }
    

    public void getPrintReceiptAtBeginningScreen()
    {
        
        DisplayMessage receipt = new DisplayMessage();
        receipt.setText("Do you want to print your");
        screen.DisplayScreen(receipt, 230, 160, true);

        DisplayMessage receipt2 = new DisplayMessage();
        receipt2.setText("receipt?");
        screen.DisplayScreen(receipt2, 280, 180, false);
        
        DisplayMessage submitMessage = new DisplayMessage();
        submitMessage.setText("yes>>");
        screen.DisplayScreen(submitMessage, 360, 260, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("No>>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);

    }
    
    public void selectFuelTypeHelpMessage()
    {
        DisplayMessage selectMessage1 = new DisplayMessage();
        selectMessage1.setText("Select a fuel type from the");
        screen.DisplayScreen(selectMessage1, 230, 160, true);
        
        DisplayMessage selectMessage2 = new DisplayMessage();
        selectMessage2.setText("below 3 options");
        screen.DisplayScreen(selectMessage2, 260, 190, false);

        DisplayMessage cancelMessage = new DisplayMessage();
        cancelMessage.setText("Back >>");
        screen.DisplayScreen(cancelMessage, 360, 310, false);
    }
    
    public void reciptPrinted()
    {
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Receipt Printed");
        screen.DisplayScreen(welcomeMessage1, 230, 140, false);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("Please take your card.");
        screen.DisplayScreen(welcomeMessage2, 230, 160, false);
        
        DisplayMessage welcomeMessage3 = new DisplayMessage();
        welcomeMessage3.setText("Thank you! Visit again.");
        screen.DisplayScreen(welcomeMessage3, 240, 190, false);
    }
    
    public void getCarWashScreen()
    {
        DisplayMessage carWash1 = new DisplayMessage();
        carWash1.setText("Do you want a car wash?");
        screen.DisplayScreen(carWash1, 220, 140, true);
        
        DisplayMessage carWash2 = new DisplayMessage();
        carWash2.setText("Offer for car wash:");
        screen.DisplayScreen(carWash2, 240, 170, false);
        
        DisplayMessage carWash3 = new DisplayMessage();
        carWash3.setText("You will get a 10%");
        screen.DisplayScreen(carWash3, 240, 190, false);
        
        DisplayMessage carWash4 = new DisplayMessage();
        carWash4.setText(" discount on fuel!");
        screen.DisplayScreen(carWash4, 240, 210, false);
        
        DisplayMessage yesMessage = new DisplayMessage();
        yesMessage.setText("Yes >>");
        screen.DisplayScreen(yesMessage, 360, 250, false);

        DisplayMessage noMessage = new DisplayMessage();
        noMessage.setText("No >>");
        screen.DisplayScreen(noMessage, 360, 310, false);
    }
    
    public void displayZeroCost()
   {
       DisplayMessage gasPumpingCost = new DisplayMessage();
       gasPumpingCost.setID("totalCost");
       gasPumpingCost.setText("$ 0.000");
       fuelDisplay.DisplayScreen(gasPumpingCost,280,25, true);
       DisplayMessage gasPumpingQuantity = new DisplayMessage();
       gasPumpingQuantity.setID("fuelQuantity");
       gasPumpingQuantity.setText("0.000");
       fuelDisplay.DisplayScreen(gasPumpingQuantity,290,40, false);
   }
   
   public synchronized void displayCostAndQuantity(double totalCost, double fuelQuantity)
   {
       DecimalFormat df = new DecimalFormat("#.###");
       df.setRoundingMode(RoundingMode.CEILING);
       DisplayMessage gasPumpingCost = new DisplayMessage();
       gasPumpingCost.setID("totalCost");
       gasPumpingCost.setText("$ " + df.format(totalCost));
       fuelDisplay.DisplayScreen(gasPumpingCost,280,25, true);
       DisplayMessage gasPumpingQuantity = new DisplayMessage();
       gasPumpingQuantity.setID("fuelQuantity");
       gasPumpingQuantity.setText(df.format(fuelQuantity));
       fuelDisplay.DisplayScreen(gasPumpingQuantity,290,40, false);
   }
    
    
    
}
