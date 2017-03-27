
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
        //state.onDisplayButtonPress(String id);
    }
    
    public State onNumberButtonPress(){
        return null;
    }
    
    public State onNozzleClick(){
        return null;
    }
    
    public State onCreditCardClick(){
       return null;
    }
    
    public String getStateFuelName(){
        return null;
    }
    public State onFuelTypeClick(){
        return null;
    }
    
    public State onUnFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    public State onPrmFuelTypeClick(){
       // return new HasValidFuelType();
       return null;
    }
    
    public void insertCreditCard()
	{
	    state.insertCreditCard();
	}
    public void enterPinCode()
	{
	    state.enterPinCode();
	}
    public void proceedWithTransaction()
	{
	    state.proceedWithTransaction();
	}
    public void cancelTransaction()
	{
	    state.cancelTransaction();
	}
    public void pumpFuel()
	{
	    state.pumpFuel();
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