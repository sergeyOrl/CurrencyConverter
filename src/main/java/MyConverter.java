import java.awt.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MyConverter {
    public static void main(String[] args) {
        CoinFactory coinfactory = new CoinFactory();
        System.out.println("Welcome to currency converter");
        String continueConvert;
        List<Double> resultsList = new ArrayList<Double>();
        PrintWriter results = null; // create empty list to write results
        results = GetConvertionsResults.getConvertionsResults();
        Desktop desktop = Desktop.getDesktop();
        // main loop for the program
        do {
            System.out.println("Please choose an option 1/2/3");
            System.out.println("1. Dollars to Shekels");
            System.out.println("2. Shekels to Dollars");
            System.out.println("3. Shekels to Euros");
            // handling user input
            UserChoice currencyChoice = new UserChoice();
            int x = currencyChoice.choice();
            // handling x options + calling HandlingExceptions method
            XOptions.xOptions(coinfactory, resultsList, results, x);
            System.out.println("Enter Y - to start over ,N - to exit");
            // handling user input
            UserContinueChoice stayOrLeave = new UserContinueChoice();
            continueConvert = stayOrLeave.continueChoice(resultsList, results, desktop);
        } while ("Y".equalsIgnoreCase(continueConvert));



    }
}


