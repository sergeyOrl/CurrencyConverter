import java.io.PrintWriter;
import java.util.List;

public class XOptions {
    /**
     * System redirect user to different currencies' conversion depend on user choice
     *
     * @param coinfactory  creating coin instance
     * @param resultsList  list where system stores conversion results after each conversion
     * @param results      result of conversion
     * @param x            user choice of currency
     */
    public static void xOptions(CoinFactory coinfactory, List<Double> resultsList, PrintWriter results, int x) {
        if (x == 1) {
            XInsertOptions(coinfactory, Coins.ILS, resultsList, results);
        } else if (x == 2){
            XInsertOptions(coinfactory, Coins.USD, resultsList, results);
        }else {
            XInsertOptions(coinfactory, Coins.EUR, resultsList, results);
        }
    }

    /**
     * Method validate user input, calling HandlingException function
     *
     * @param coinfactory   creating coin instance
     * @param ils           kind of coin
     * @param resultsList  list where system stores conversion results after each conversion
     * @param results      result of conversion
     */
    private static void XInsertOptions(CoinFactory coinfactory, Coins ils, List<Double> resultsList, PrintWriter results) {
        System.out.println("Please enter an amount to convert");
        boolean number1 = false;
        // handle invalid inputs + calling CurrencyAction method
        HandlingExceptions.handlingException(number1, coinfactory, ils, resultsList, results);
    }
}
