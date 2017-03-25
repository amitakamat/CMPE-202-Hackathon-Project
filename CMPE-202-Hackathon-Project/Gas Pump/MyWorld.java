import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    // 8 buttons to the left and right of the Screen
    ScreenButton button1 = new ScreenButton("1");
    ScreenButton button2 = new ScreenButton("2");
    ScreenButton button3 = new ScreenButton("3");
    ScreenButton button4 = new ScreenButton("4");
    ScreenButton button5 = new ScreenButton("5");
    ScreenButton button6 = new ScreenButton("6");
    ScreenButton button7 = new ScreenButton("7");
    ScreenButton button8 = new ScreenButton("8");
    
    
    //Numeric keys numbered 0-9 on the key pad
    NumKeyButton NumButton1 = new NumKeyButton("1");
    NumKeyButton NumButton2 = new NumKeyButton("2");
    NumKeyButton NumButton3 = new NumKeyButton("3");
    NumKeyButton NumButton4 = new NumKeyButton("4");
    NumKeyButton NumButton5 = new NumKeyButton("5");
    NumKeyButton NumButton6 = new NumKeyButton("6");
    NumKeyButton NumButton7 = new NumKeyButton("7");
    NumKeyButton NumButton8 = new NumKeyButton("8");
    NumKeyButton NumButton9 = new NumKeyButton("9");
    NumKeyButton NumButton0 = new NumKeyButton("0");

    Screen screen = new Screen();
    
    FuelDisplay fueldisplay = new FuelDisplay();
    
    ReceiptPrinter receiptprinter = new ReceiptPrinter();
    
    CardReader cardreader = new CardReader();
    
    Nozzle nozzle = new Nozzle();
    
    State state = new HasNoCreditCard();
        
    public Screen getScreen(){
        return this.screen;
    }
    
    public FuelDisplay getFuelDisplayScreen(){
        return this.fueldisplay;
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        createDisplay();
        prepare();
    }

    public void createDisplay()
    {
        //setBackground(DisplayPanelBackground.png);  
        addObject(NumButton1, 240, 500);
        addObject(NumButton2, 295, 500);
        addObject(NumButton3, 350, 500);
        addObject(NumButton4, 240, 555);
        addObject(NumButton5, 295, 555);
        addObject(NumButton6, 350, 555);
        addObject(NumButton7, 240, 610);
        addObject(NumButton8, 295, 610);
        addObject(NumButton9, 350, 610);
        addObject(NumButton0,295, 665);

        addObject(button1, 100, 160);
        addObject(button2, 100, 225);
        addObject(button3, 100, 295);
        addObject(button4, 100, 365);
        addObject(button5, 500, 160);
        addObject(button6, 500, 225);
        addObject(button7, 500, 295);
        addObject(button8, 500, 365);
        
        addObject(fueldisplay,300,60);
        
        addObject(nozzle,850,380);
        
        addObject(screen, 300, 260);

        addObject(cardreader,600,220);

        addObject(receiptprinter,600,360);
        
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please insert a credit");
        screen.DisplayScreen(welcomeMessage1, 230, 200, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("card to proceed");
        screen.DisplayScreen(welcomeMessage2, 240, 230, false);
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
