/**
 * Write a description of class HasNoValidFuelType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasNoValidFuelType  extends ConcreteState
{
    public HasNoValidFuelType(GasPumpMachine gasPumpMachine)
    {
        super(gasPumpMachine);
        stateName = "HasNoValidFuelType";
    }

}
