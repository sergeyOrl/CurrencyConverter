import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 * Method checks if user wants to continue to convert or exit
 */
public class UserContinueChoice {
    /**
     * Method will check user input and will redirect user to next conversion
     * or exit program and display list of results
     *
     * @param resultsList  list where system stores conversion results after each conversion
     * @param results      result of conversion
     * @param desktop      calling desktop
     * @return             list with results
     */
    public String continueChoice(List<Double> resultsList, PrintWriter results, Desktop desktop) {
        String continueConvert;
        continueConvert = (new Scanner(System.in)).next();
        while (!"Y".equalsIgnoreCase(continueConvert) && !"N".equalsIgnoreCase(continueConvert)) {
            System.out.println("Invalid choice, please try again");
            continueConvert = (new Scanner(System.in)).next();
        }
        if ("N".equalsIgnoreCase(continueConvert)) {
            System.out.println("Thank you for using our currency converter");
            System.out.println(resultsList);
            results.close();// closing results.txt
            try {
                desktop.open(new File("results"));// open results file in desktop
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return continueConvert;
    }
}
