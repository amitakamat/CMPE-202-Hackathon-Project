  import greenfoot.*; 
public class GasPumpMachine {

  State hasNoCreditCardState;
  State hasValidCreditCardState;
  State fuelMenuState;
  State nozzleUnlockState;
  State pumpFuelState;
  State transactionSummaryState;
  State printReceiptState;
  State displayTransactionMessageState;
  State removeCreditCardState;
  State hasFuelState;
  State state = hasNoCreditCardState;
  float count = 0;
  double units = 5;
    private boolean hasCarWash;
    private double fuelUnitCost = 1.0;
    public double fuelCost; 
   /// protected double unitCost;
  
  final String zipcode = "94085";
  
  String enteredZip="";

    State hasValidZipCodeState;

  public GasPumpMachine(float quantityOfFuel) 
  {

      hasNoCreditCardState = new HasNoCreditCardState(this);
      hasValidCreditCardState = new HasValidCreditCardState(this);
      fuelMenuState = new FuelMenuState(this);
      nozzleUnlockState = new NozzleUnlockState(this);
      pumpFuelState = new PumpFuelState(this);
      transactionSummaryState = new TransactionSummaryState(this);
      printReceiptState = new PrintReceiptState(this);
      displayTransactionMessageState = new DisplayTransactionMessageState(this);
      removeCreditCardState = new RemoveCreditCardState(this); 
      hasFuelState = new HasFuelState(this);
      
      hasValidZipCodeState = new HasValidZipCode(this);
      
      this.count = quantityOfFuel;
    if (quantityOfFuel > 0) {
      state = hasNoCreditCardState;
    }
  }
  
    public State onDisplayButtonPress(String id){
        //System.out.println("In GPM, onDisplayButtonPress");
        return state.onDisplayButtonPress(id);
    }

    public State onCreditCardSwipe(String cardType){
      //System.out.println("In GPM, on credit card swipe");
      return state.onCreditCardSwipe(cardType);
      
    }
    
    public void onKeyPadButtonPress(){
        state.onNumberButtonPress();
    }
    
    public void onNozzleClick(){
        state.onNozzleClick();
    }
    

    
    public State onFuelTypeClick(){
        //state.onFuelTypeClick();
        return hasFuelState;
    }
    
      
    
  void setState(State state) {
    this.state = state;
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
  
  public State getFuelMenuState() {
    return fuelMenuState;
  }
  
  public State getNozzleUnlockState() {
    return nozzleUnlockState;
  }
  
  public State getPumpFuelState() {
    return pumpFuelState;
  }
  
  public State getTransactionSummaryState() {
    return transactionSummaryState;
  }
  
  public State getPrintReceiptState() {
    return printReceiptState;
  }
  
  public State getDisplayTransactionMessageState() {
    return displayTransactionMessageState;
  }

  public State getRemoveCreditCardState() {
    return removeCreditCardState;
  }
  
  public State getHasFuelState() { 
    return hasFuelState;
  }
    
public State gethasValidZipCodeState() { 
    return hasValidZipCodeState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nGas Pump, Inc.");
    result.append("\nInventory: " + count + " fuel");

    result.append("\n");
    result.append("Machine is in" + state + "\n");
    return result.toString();
  }

  public void setEnteredZip(String num){
  
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
    
    
 public void calculateFuelCost(int units) 
    {
         fuelCost = fuelUnitCost*units;
        
    }
  
}