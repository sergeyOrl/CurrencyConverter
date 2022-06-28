import java.util.InputMismatchException;
import java.util.Scanner;

public class UserChoice {
    public int choice() {
        int x = 0;
        boolean number = false;
        while (!number) { // loop to handle invalid inputs (letters, symbols)
            try {
                x = (new Scanner(System.in)).nextInt();
                while(x != 1 && x != 2 && x != 3){ // loop to handle invalid numbers
                    System.out.println("Invalid choice, please try again");
                    x = (new Scanner(System.in)).nextInt();
                }
                number = true;
            } catch (InputMismatchException i) {
                System.out.println("Invalid choice, please try again");
            }
        }
        return x;
    }
}
