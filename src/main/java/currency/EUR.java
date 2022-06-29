package currency;

/**
 * Create currency
 *
 * @author  Sergey Orlov
 */
public class EUR extends Coin{

    public double value = 4.23;

    /**
     * @see  Coin
     * @return  conversion rate - type double
     */
    @Override
    public double getValue() {
        return value;
    }

    /**
     * @param value user input
     * @return      conversion result
     */
    @Override
    public double calculate(double value) {
        return getValue() * value;
    }
}
