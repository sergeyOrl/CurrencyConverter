import currency.Coin;
import currency.EUR;
import currency.ILS;
import currency.USD;

public class CoinFactory {
    public Coin getCoinInstance(Coins coin) {
        return switch (coin) {
            case USD -> new USD();
            case ILS -> new ILS();
            case EUR -> new EUR();
        };
    }
}
