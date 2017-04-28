import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    int width;
    int height;
    String id;
    
    
    MyWorld world ;

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("beep.wav");
            world = (MyWorld)getWorld();
            Nozzle nozzle = world.getNozzle();
            nozzle.ShouldChecktimeout = false;
        }
    }    

    public void submit(String id){
        MyWorld world = (MyWorld)getWorld();
        GasPumpMachine gpm = world.getGasPumpMachine();
        ScreenMessages screenMessages = new ScreenMessages(world);
        FuelDisplay fueldisplay = world.getFuelDisplayScreen();

        if(gpm.state.getStateName() == "PrintReceiptState")
        {
            if(id == "7"||id=="yes")
            {

                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);
                String s=String.valueOf(df.format(gpm.getTotalCost()));
                Receipt receipt1=new Receipt();
                receipt1.setText("Total Cost : $" + s);
                gpm.setState(gpm.getRemoveCreditCardState());
                // world.addObject(receipt2,600,450);
                world.addObject(receipt1,600,450);
                screenMessages.getRemoveCreditCardScreen();
                Greenfoot.delay(500);
                screenMessages.getNoCreditCardScreen();
                gpm.setState(gpm.getHasNoCreditCardState());
                fueldisplay.ClearTransaction();
                gpm.setFuelQuantity(0.00);
                gpm.setTotalCost(0.00);
                world.removeObject(receipt1);
            }
            else
            {
                gpm.setState(gpm.getRemoveCreditCardState());
                screenMessages.getRemoveCreditCardScreen();
                Greenfoot.delay(500);
                screenMessages.getNoCreditCardScreen();
                gpm.setState(gpm.getHasNoCreditCardState());
                fueldisplay.ClearTransaction();
                gpm.setFuelQuantity(0.00);
                gpm.setTotalCost(0.00);
            }
        }

        State state = gpm.onDisplayButtonPress(id);
        String scenario = gpm.getScenario();
        Screen screen=world.getScreen();
        if(state != null){
            screen.ResetZip();
            gpm.setState(state);
            String stateName = gpm.state.getStateName();
            boolean flag = false;
            System.out.println("stateName:"+stateName);
            if(stateName == "HasValidZipCode")
            {               
                if(scenario.equals("1"))
                    screenMessages.getHasValidZipCodeScreen();
                else if(scenario.equals("3"))
                    screenMessages.getPrintReceiptAtBeginningScreen();
                else if(scenario.equals("2"))
                    screenMessages.getCarWashScreen();
            }
            // else if(stateName == "HasNoCreditCardState"){
            //   screen.ResetZip();
            //}
            if(stateName == "HasCarWashState")
            {
                screenMessages.getHasValidZipCodeScreen();
            }

            if(stateName == "HelpState")
            {
                if(scenario.equals("1"))
                    screenMessages.selectFuelTypeHelpMessage();
                else if(scenario.equals("3"))
                //screenMessages.getPrintReceiptAtBeginningScreen();
                    screenMessages.selectFuelTypeHelpMessage();
                else if(scenario.equals("2"))
                //screenMessages.getCarWashScreen();
                    screenMessages.selectFuelTypeHelpMessage();
            }

            if(stateName == "HasNoCreditCard"){
                screenMessages.getNoCreditCardScreen();
            }

            if(stateName == "RemoveCreditCardState"){
                screenMessages.getRemoveCreditCardScreen();
                Greenfoot.delay(300);
                screenMessages.getNoCreditCardScreen();
                gpm.setState(gpm.getHasNoCreditCardState());
            }

            if(stateName == "PrintReceiptInAdvanceState")
            {
                screenMessages.getHasValidZipCodeScreen();
            }            

            if(stateName == "HasFuelState"){
                screenMessages.getNoCreditCardScreen();
            }

            if(stateName == "PumpFuelState")
            {
                screenMessages.getBeginFueling();
            }

        }
    }
}
