package currency;

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
