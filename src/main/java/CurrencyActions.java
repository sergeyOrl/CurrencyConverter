import currency.Coin;

import java.io.PrintWriter;
import java.util.List;


public class CurrencyActions {
    /**
     * Method create instance of coin, convert user input to created coin,
     * display result on the screen, add results to the list
     *
     * @param coinfactory  creating coin instance
     * @param eur          kind of coin
     * @param y            user input amount to convert , type - double
     * @param resultsList  list where system stores conversion results after each conversion
     * @param results      result of conversion
     */
    public static void currencyActions(CoinFactory coinfactory, Coins eur, double y, List<Double> resultsList, PrintWriter results) {
        Coin euro = coinfactory.getCoinInstance(eur);
        // didn't specify amount od digits after decimal because it's not in requirements
        System.out.println(euro.calculate(y));
        resultsList.add(euro.calculate(y));
        results.println(euro.calculate(y));
    }
}
