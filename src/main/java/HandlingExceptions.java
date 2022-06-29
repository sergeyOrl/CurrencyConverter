import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HandlingExceptions {
    /**
     * Method collect user input, validate that it's a number (if not - system display error message),
     * calling to CurrencyAction function
     *
     * @param number1      validation for user input - only numbers
     * @param coinfactory  creating coin instance
     * @param usd          kind of coin
     * @param resultsList  list where system stores conversion results after each conversion
     * @param results      result of conversion
     */
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