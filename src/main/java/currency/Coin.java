package currency;

import calculation.ICalculate;

/**
 * Father class for coins
 *
 * @author  Sergey Orlov
 */
public abstract class Coin implements ICalculate {
    /**
     * @return  user input - type double
     */
    public abstract double getValue();

}
