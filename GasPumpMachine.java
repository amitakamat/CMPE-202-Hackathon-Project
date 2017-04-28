import greenfoot.*; 

public class GasPumpMachine {
    MyWorld world;
    State hasNoCreditCardState;
    State hasValidCreditCardState;
    State nozzleUnlockState;
    State pumpFuelState;
    State printReceiptState;
    State transactionSummaryState;
    State removeCreditCardState;
    State hasFuelState;
    State state = hasNoCreditCardState;
    State hasCarWashState;
    State helpState;
    State printReceiptInAdvanceState;
    State hasValidZipCodeState;
    
    Nozzle nozzle;

    float count = 0;
    double units = 5;
    private boolean hasCarWash = false;
    private boolean printReceiptInAdvance = false;
    private double fuelUnitCost;
    public double fuelCost; 
    private double fuelQuantity = 0.000;
    private double totalCost = 0.000;
    private boolean isFuelling = false;
    public boolean FuellingFlagLocked = false;

    private String gpmScenario="1";
    final String zipcode = "94085";  
    String enteredZip="";

    public GasPumpMachine(float quantityOfFuel,String scenario, MyWorld w) 
    {
        this.world = w;
        hasNoCreditCardState = new HasNoCreditCardState(this);
        hasValidCreditCardState = new HasValidCreditCardState(this);
        nozzleUnlockState = new NozzleUnlockState(this);
        pumpFuelState = new PumpFuelState(this);
        printReceiptState = new PrintReceiptState(this, w);
        removeCreditCardState = new RemoveCreditCardState(this); 
        hasFuelState = new HasFuelState(this);
        hasCarWashState = new HasCarWashState(this);
        hasValidZipCodeState = new HasValidZipCode(this,w);
        helpState = new HelpState(this);
        printReceiptInAdvanceState = new PrintReceiptInAdvanceState(this);
        transactionSummaryState = new TransactionSummaryState(this);
        this.count = quantityOfFuel;
        this.gpmScenario = scenario;
        if (quantityOfFuel > 0) 
        {
            state = hasNoCreditCardState;
        }
    }

    public String getScenario()
    {
        return this.gpmScenario;    
    }

    public State onDisplayButtonPress(String id){
        return state.onDisplayButtonPress(id);
    }

    public State onCreditCardSwipe(String cardType){
        return state.onCreditCardSwipe(cardType);

    }

    public void onKeyPadButtonPress(String id){
        state.onKeypadButtonPress(id);
    }

    public void onNozzleClick(){
        state.onNozzleDrag();
    }

    public State onFuelTypeClick(){
        return hasFuelState;
    }

    void setState(State state) {
        this.state = state;
        if(this.state.getStateName()=="HasValidZipCode"){
            if(this.gpmScenario=="3"){
                nozzle = world.getNozzle();
                nozzle.startTimer();
            }
        }
    }

    float getFuelCount() {
        return count;
    }

    void refill(float count) {
        this.count = count;
        state = hasNoCreditCardState;
    }

    public State getState() {
        return state;
    }

    public State getHasNoCreditCardState() {
        return hasNoCreditCardState;
    }

    public State getHasValidCreditCardState() {
        return hasValidCreditCardState;
    }

    public State getTransactionSummaryState() {
        return transactionSummaryState;
    }

    public State getNozzleUnlockState() {
        return nozzleUnlockState;
    }

    public State getPumpFuelState() {
        return pumpFuelState;
    }

    public State getPrintReceiptState() {
        return printReceiptState;
    }

    public State getRemoveCreditCardState() {
        return removeCreditCardState;
    }

    public State getHasFuelState() { 
        return hasFuelState;
    }

    public State getHasValidZipCodeState() { 
        return hasValidZipCodeState;
    }

    public State getHasCarWashState() { 
        return hasCarWashState;
    }

    public State getHelpState() {
        return helpState;
    }

    public State getPrintReceiptInAdvanceState() { 
        return printReceiptInAdvanceState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nGas Pump, Inc.");
        result.append("\nInventory: " + count + " fuel");

        result.append("\n");
        result.append("Machine is in" + state + "\n");
        return result.toString();
    }

    public void setEnteredZip(String num)
    {
        state.enterPinCode(num);
    }

    public void setFuelType(double unitCost)
    {
        fuelUnitCost = unitCost;
    }

    public double getFuelTypeCost() 
    {
        return fuelUnitCost;
    }

    public void setHasCarWash(boolean carWashSelected)
    {
        hasCarWash = carWashSelected;
    }

    public boolean getHasCarWash() 
    {
        return hasCarWash;
    }

    public boolean getPrintReceiptInAdvance() { 
        return printReceiptInAdvance;
    }

    public void setPrintReceiptInAdvance(boolean printReceiptInAdvanceSelected)
    {
        printReceiptInAdvance = printReceiptInAdvanceSelected;
    }

    public void setFuelCost(double unitCost)
    {
        fuelUnitCost = unitCost;
    }

    public synchronized double getFuelCost() 
    {
        return fuelUnitCost;
    }

    public synchronized void setFuelQuantity(double quantity)
    {
        fuelQuantity = quantity;
    }

    public synchronized double getFuelQuantity() 
    {
        return fuelQuantity;
    }

    public synchronized void setTotalCost(double tCost)
    {
        totalCost = tCost;
    }

    public double getTotalCost() 
    {
        return totalCost;
    }

    public synchronized void setFuellingFlag(boolean fuelling)
    {
        this.isFuelling = fuelling;
    }

    public synchronized boolean getFuellingFlag() 
    {
        return this.isFuelling;
    }

    public void checkAndCalculateForCarWash()
    {
        if(hasCarWash)
        {   
            totalCost = totalCost - (0.1*totalCost);
        } 
    }
}