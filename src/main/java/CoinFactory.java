import currency.Coin;
import currency.EUR;
import currency.ILS;
import currency.USD;

/**
 * Creating coin instance
 *
 * @author  Sergey Orlov
 */
public class CoinFactory {
    /**
     * @param coin  choice of currency
     * @return      instance of chosen currency
     */
    public Coin getCoinInstance(Coins coin) {
        return switch (coin) {
            case USD -> new USD();
            case ILS -> new ILS();
            case EUR -> new EUR();
        };
    }
}
