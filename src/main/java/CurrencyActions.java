import currency.Coin;

import java.io.PrintWriter;
import java.util.List;


public class CurrencyActions {
    public static void currencyActions(CoinFactory coinfactory, Coins eur, double y, List<Double> resultsList, PrintWriter results) {
        Coin euro = coinfactory.getCoinInstance(eur);
        // didn't specify amount od digits after decimal because it's not in requirements
        System.out.println(euro.calculate(y));
        resultsList.add(euro.calculate(y));
        results.println(euro.calculate(y));
    }
}
