import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)/**
/**
 * Write a description of class HasNoCreditCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransactionSummaryState extends ConcreteState
{

  public TransactionSummaryState(GasPumpMachine gasPumpMachine) {
    super(gasPumpMachine);
    stateName = "TransactionSummaryState";
  }
    
    public State onCreditCardSwipe(String cardType){
        return new HasValidCreditCardState(this.gasPumpMachine);
    }
    
  public State onDisplayButtonPress(String id){
        String scenario = gasPumpMachine.getScenario();
        //might need to move help
        if(id.equals("7"))
        {
                //set the variable and go to validZipCodeState and continue with fuel selection
            gasPumpMachine.setState(gasPumpMachine.getPrintReceiptState());
            return gasPumpMachine.getState();
        }
        
        if (id.equals("8"))
        {
            gasPumpMachine.setState(gasPumpMachine.getHasNoCreditCardState());
            return gasPumpMachine.getState();
        }
        return null;
    }
 
  public String toString() {
    return "TransactionSummaryState";
  }
}