import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class UserContinueChoice {
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
