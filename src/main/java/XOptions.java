import java.io.PrintWriter;
import java.util.List;

public class XOptions {
    public static void xOptions(CoinFactory coinfactory, List<Double> resultsList, PrintWriter results, int x) {
        if (x == 1) {
            XInsertOptions(coinfactory, Coins.ILS, resultsList, results);
        } else if (x == 2){
            XInsertOptions(coinfactory, Coins.USD, resultsList, results);
        }else {
            XInsertOptions(coinfactory, Coins.EUR, resultsList, results);
        }
    }

    private static void XInsertOptions(CoinFactory coinfactory, Coins ils, List<Double> resultsList, PrintWriter results) {
        System.out.println("Please enter an amount to convert");
        boolean number1 = false;
        // handle invalid inputs + calling CurrencyAction method
        HandlingExceptions.handlingException(number1, coinfactory, ils, resultsList, results);
    }
}
