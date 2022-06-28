import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GetConvertionsResults {
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