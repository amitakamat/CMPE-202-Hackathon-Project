import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("beep.wav");
        }
    }    

    public void submit(String id){
        MyWorld world = (MyWorld)getWorld();
        GasPumpMachine gpm = world.getGasPumpMachine();
        State state = gpm.onDisplayButtonPress(this.id);
        String scenario = gpm.getScenario();
        System.out.println(state);
        if(state != null){
            gpm.setState(state);
            String stateName = gpm.state.getStateName();
            ScreenMessages screenMessages = new ScreenMessages(world);
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
                    screenMessages.getCarWashScreen();
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
