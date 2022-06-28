import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HandlingExceptions {
    public static void handlingException(boolean number1, CoinFactory coinfactory, Coins usd, List<Double> resultsList, PrintWriter results) {
        while (!number1) {
            try {
                double y = (new Scanner(System.in)).nextDouble();
                number1 = true;
                // method perform actions - creating coin, calculation, displaying results, adding result to file,
                CurrencyActions.currencyActions(coinfactory, usd, y, resultsList, results);
            } catch (InputMismatchException i) {
                System.out.println("Invalid choice, please try again");
            }
        }

    }
}