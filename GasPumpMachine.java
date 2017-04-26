  import greenfoot.*; 
public class GasPumpMachine {
  MyWorld w;
  State hasNoCreditCardState;
  State hasValidCreditCardState;
  State nozzleUnlockState;
  State pumpFuelState;
  State printReceiptState;
  State removeCreditCardState;
  State hasFuelState;
  State state = hasNoCreditCardState;
  State hasCarWashState;
  State helpState;
  State printReceiptInAdvanceState;
  State hasValidZipCodeState;
  
  float count = 0;
  double units = 5;
  private boolean hasCarWash = false;
  private boolean printReceiptInAdvance = false;
  private double fuelUnitCost = 1.0;
  public double fuelCost; 
  private String gpmScenario="1";
  final String zipcode = "94085";  
  String enteredZip="";

  public GasPumpMachine(float quantityOfFuel,String scenario, MyWorld w) 
  {

      hasNoCreditCardState = new HasNoCreditCardState(this);
      hasValidCreditCardState = new HasValidCreditCardState(this);
      nozzleUnlockState = new NozzleUnlockState(this);
      pumpFuelState = new PumpFuelState(this);
      printReceiptState = new PrintReceiptState(this, w);
      removeCreditCardState = new RemoveCreditCardState(this); 
      hasFuelState = new HasFuelState(this);
      hasCarWashState = new HasCarWashState(this);
      hasValidZipCodeState = new HasValidZipCode(this);
      helpState = new HelpState(this);
      printReceiptInAdvanceState = new PrintReceiptInAdvanceState(this);
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
  
  public void setFuelCost(double f)
  {
      this.fuelCost = f;
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
  
 public void calculateFuelCost(int units) 
 {
     double actualCost = fuelUnitCost*units;
     if(hasCarWash)
     {   
         fuelCost = actualCost - (0.1*actualCost);
     }
     else
     {
         fuelCost = actualCost;
     }
     fuelCost = fuelUnitCost*units;   
 }
  
}