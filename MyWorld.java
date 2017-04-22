import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{

    Screen screen = new Screen();
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
    
    NumKeyButton NB1 = new NumKeyButton("1", "one.png");
    NumKeyButton NB2 = new NumKeyButton("2", "two.png");
    NumKeyButton NB3 = new NumKeyButton("3", "three.png");
    NumKeyButton NB4 = new NumKeyButton("4", "four.png");
    NumKeyButton NB5 = new NumKeyButton("5", "five.png");
    NumKeyButton NB6 = new NumKeyButton("6", "six.png");
    NumKeyButton NB7 = new NumKeyButton("7", "seven.png");
    NumKeyButton NB8 = new NumKeyButton("8", "eight.png");
    NumKeyButton NB9 = new NumKeyButton("9", "nine.png");
    NumKeyButton NB0 = new NumKeyButton("0", "zero.png");

    NumKeyButton clr = new NumKeyButton("clear", "clear.png");

    NumKeyButton entr = new NumKeyButton("enter", "enter.png");

    NumKeyButton yes = new NumKeyButton("yes", "yes.png");
    NumKeyButton no = new NumKeyButton("no", "no.png");   
    NumKeyButton help = new NumKeyButton("help", "help.png");
    NumKeyButton cancel = new NumKeyButton("cancel", "cancel.png");

    FuelDisplay fueldisplay = new FuelDisplay();
    ReceiptPrinter receiptprinter = new ReceiptPrinter();
    CardReader cardreader = new CardReader();
    FuelType reg = new FuelType("1", "Regular.jpeg");
    FuelType unl = new FuelType("2", "Unleaded.jpeg");
    FuelType prm = new FuelType("3", "Premium.jpeg");

    Nozzle nozzle = new Nozzle();

    GasPumpMachine gpm = new GasPumpMachine(100.0f, this);
    //State state = new HasNoCreditCardState(gpm);
    //for regular fuel
    //State fuel = new HasNoValidFuelType();
    //for unleaded
    //State fuelu = new HasNoValidFuelType();
    // for premium
    //State fuelp = new HasNoValidFuelType();
    //NumKey1 Key1 = new NumKey1("1");

    //for visa card
    VisaCard visaCard = new VisaCard();
    //for master card
    MasterCard masterCard = new MasterCard();
    //for fake credit card
    FakeCreditCard fakeCreditCard = new FakeCreditCard();

    
    //
    public GasPumpMachine getGasPumpMachine(){
        return this.gpm;
    }

    public Screen getScreen(){
        return this.screen;
    }

    public FuelDisplay getFuelDisplayScreen(){
        return this.fueldisplay;
    }

    public NumKeyButton getNumKeyButton(){
        return this.NB2;
    }

    public FuelType getFuelType(){
        return this.reg;
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
        addObject(NB1, 228, 420);
        addObject(NB2, 280, 420);
        addObject(NB3, 332, 420);
        addObject(NB4, 228, 472);
        addObject(NB5, 280, 472);
        addObject(NB6, 332, 472);
        addObject(NB7, 228, 524);
        addObject(NB8, 280, 524);
        addObject(NB9, 332, 524);
        addObject(NB0, 280, 576);
        
        addObject(yes, 384, 420);
        addObject(no, 384, 472);
        addObject(help, 384, 524);
        addObject(cancel, 384, 576);
        
        addObject(clr, 228, 576);

        addObject(entr, 332, 576);

        addObject(button1, 100, 140);
        addObject(button2, 100, 200);
        addObject(button3, 100, 260);
        addObject(button4, 100, 320);
        addObject(button5, 496, 140);
        addObject(button6, 496, 200);
        addObject(button7, 496, 260);
        addObject(button8, 496, 320);

        addObject(fueldisplay,297,37);
        //Regular fuel,premium ,unleaded
        addObject(reg,179,690);
        addObject(unl,313,689);
        addObject(prm,442,688);

        addObject(nozzle,850,250);

        addObject(screen, 304, 230);

        addObject(cardreader,600,220);
        addObject(visaCard,730,240);
        addObject(masterCard,730,150);
        addObject(fakeCreditCard,740,330);
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