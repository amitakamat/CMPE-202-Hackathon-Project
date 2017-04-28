/**
 * Write a description of class CostCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CostCalculator implements Runnable
{
    GasPumpMachine gasPumpMachine;
    ScreenMessages screenMessages;

    /**
     * Constructor for objects of class CostCalculator
     */
    public CostCalculator(GasPumpMachine gpm, ScreenMessages sm)
    {
        this.gasPumpMachine = gpm;
        this.screenMessages = sm;
    }

    /**
     * This is what the thread will do.
     */
    public void run()
    {
        //if(!gasPumpMachine.FuellingFlagLocked)
        //{
            while (gasPumpMachine.getFuellingFlag()) { //don't let the thread die!
                double fuelQuantity = gasPumpMachine.getFuelQuantity() + 0.001;
                gasPumpMachine.setFuelQuantity(fuelQuantity);
                double totalCost = fuelQuantity * gasPumpMachine.getFuelCost();
                gasPumpMachine.setTotalCost(totalCost);
                screenMessages.displayCostAndQuantity(totalCost, fuelQuantity);
                
                //otherwise it would move too fast:
                try {
                    Thread.sleep(5);
                } catch (Exception e) {
                    break;
                }
            }
        //}
       /* else
        {
            try 
            {
                Thread.sleep(2);
            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }*/
    }
}
