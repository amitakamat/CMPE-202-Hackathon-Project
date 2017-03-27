
public class GasPumpMachine {

  State hasNoCreditCardState;
  State hasCreditCardState;
  State hasValidCreditCardState;
  State fuelMenuState;
  State nozzleUnlockState;
  State pumpFuelState;
  State transactionSummaryState;
  State printReceiptState;
  State displayTransactionMessageState;
  State removeCreditCardState;

  State state = hasNoCreditCardState;
  float count = 0;

  public GasPumpMachine(float quantityOfFuel) {

  hasNoCreditCardState = new HasNoCreditCardState(this);
  hasCreditCardState = new HasCreditCardState(this);
  hasValidCreditCardState = new HasValidCreditCardState(this);
  fuelMenuState = new FuelMenuState(this);
  nozzleUnlockState = new NozzleUnlockState(this);
  pumpFuelState = new PumpFuelState(this);
  transactionSummaryState = new TransactionSummaryState(this);
  printReceiptState = new PrintReceiptState(this);
  displayTransactionMessageState = new DisplayTransactionMessageState(this);
  removeCreditCardState = new RemoveCreditCardState(this);  
  
    this.count = quantityOfFuel;
    if (quantityOfFuel > 0) {
      state = hasNoCreditCardState;
    }
  }

    public void onDisplayButtonPress(String id){
        System.out.println("In GPM, onDisplayButtonPress");
        state.onDisplayButtonPress(id);
    }
    
    public void onKeyPadButtonPress(){
        state.onNumberButtonPress();
    }
    
    public void onNozzleClick(){
        state.onNozzleClick();
    }
    
    public State onCreditCardSwipe(){
      System.out.println("In GPM, on credit card swipe");
      state.onCreditCardClick();
      return null;
    }
    
    public State onFuelTypeClick(){
        state.onFuelTypeClick();
        return null;
    }
    
    public State onUnFuelTypeClick(){
        state.onUnFuelTypeClick();
       // return new HasValidFuelType();
       return null;
    }
    
    public State onPrmFuelTypeClick(){
        state.onPrmFuelTypeClick();
       // return new HasValidFuelType();
       return null;
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

  public State getHasCreditCardState() {
    return hasCreditCardState;
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

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nGas Pump, Inc.");
    result.append("\nInventory: " + count + " fuel");

    result.append("\n");
    result.append("Machine is in" + state + "\n");
    return result.toString();
  }

}