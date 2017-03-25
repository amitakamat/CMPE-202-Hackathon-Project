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
  
    
    
    NumKeyButton NB1 = new NumKeyButton("1");
    NumKeyButton NB2 = new NumKeyButton("2");
    NumKeyButton NB3 = new NumKeyButton("3");
    NumKeyButton NB4 = new NumKeyButton("4");
    NumKeyButton NB5 = new NumKeyButton("5");
    NumKeyButton NB6 = new NumKeyButton("6");
    NumKeyButton NB7 = new NumKeyButton("7");
    NumKeyButton NB8 = new NumKeyButton("8");
    NumKeyButton NB9 = new NumKeyButton("9");
    NumKeyButton NB0 = new NumKeyButton("0");
    
    
    

    Screen screen = new Screen();
    
    FuelDisplay fueldisplay = new FuelDisplay();
    
    ReceiptPrinter receiptprinter = new ReceiptPrinter();
    
    CardReader cardreader = new CardReader();
    
    FuelKeyReg reg = new FuelKeyReg();
    FuelKeyUnl unl = new FuelKeyUnl();
    FuelKeyPrm prm = new FuelKeyPrm();
    
    Nozzle nozzle = new Nozzle();
    
    State state = new HasNoCreditCard();
    //for regular fuel
    State fuel = new HasNoValidFuelType();
    //for unleaded
    State fuelu = new HasNoValidFuelType();
    // for premium
    State fuelp = new HasNoValidFuelType();
    //NumKey1 Key1 = new NumKey1("1");
    
   
        
    public Screen getScreen(){
        return this.screen;
    }
    
    public FuelDisplay getFuelDisplayScreen(){
        return this.fueldisplay;
    }
    public NumKeyButton getNumKeyButton(){
        return this.NB2;
    }
    
    public FuelKeyReg getFuelKeyReg(){
        return this.reg;
    }
    public FuelKeyUnl getFuelKeyUnl(){
        return this.unl;
    }
    public FuelKeyPrm getFuelKeyPrm(){
        return this.prm;
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
        //addObject(NB1, 240, 500);
        addObject(NB1, 228, 370);
        addObject(NB2, 282, 370);
        addObject(NB3, 337, 370);
        addObject(NB4, 228, 424);
        addObject(NB5, 282, 424);
        addObject(NB6, 336, 424);
        addObject(NB7, 229, 478);
        addObject(NB8, 283, 478);
        addObject(NB9, 336, 478);
        addObject(NB0, 283, 533);

        addObject(button1, 100, 98);
        addObject(button2, 100, 162);
        addObject(button3, 100, 224);
        addObject(button4, 100, 286);
        addObject(button5, 496, 121);
        addObject(button6, 496, 174);
        addObject(button7, 496, 234);
        addObject(button8, 496, 289);
        
        addObject(fueldisplay,297,37);
        //Regular fuel,premium ,unleaded
        addObject(reg,179,640);
        addObject(unl,313,639);
        addObject(prm,442,638);
        
        addObject(nozzle,850,150);
        
        addObject(screen, 304, 200);

        addObject(cardreader,600,220);

        addObject(receiptprinter,600,360);
        
        DisplayMessage welcomeMessage1 = new DisplayMessage();
        welcomeMessage1.setText("Please insert a credit");
        screen.DisplayScreen(welcomeMessage1, 230, 160, true);
        
        DisplayMessage welcomeMessage2 = new DisplayMessage();
        welcomeMessage2.setText("card to proceed");
        screen.DisplayScreen(welcomeMessage2, 250, 190, false);

        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}