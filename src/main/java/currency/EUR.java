package currency;

public class EUR extends Coin{

    public double value = 4.23;

    @Override
    public double getValue() {
        return value;
    }
    @Override
    public double calculate(double value) {
        return getValue() * value;
    }
}
