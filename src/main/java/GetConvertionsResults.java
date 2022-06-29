import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Method to get list for results
 */
public class GetConvertionsResults {
    /**
     * Method create new list and handle exception
     *
     * @return  empty list to write conversion results
     */
    public static PrintWriter getConvertionsResults() {
        PrintWriter results;
        try { // handling exception
            results = new PrintWriter("results");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return results;
    }
}