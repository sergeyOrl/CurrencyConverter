package currency;

/**
 * Create currency
 *
 * @see   EUR
 * @author  Sergey Orlov
 */
public class ILS extends Coin {
    final double value = 0.28;

    public ILS() {
    }

    public double getValue() {
        return 0.28;
    }

    public double calculate(double value) {
        return this.getValue() * value;
    }
}
