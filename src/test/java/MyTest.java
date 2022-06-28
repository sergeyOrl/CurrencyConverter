import calculation.ICalculate;
import currency.ILS;
import currency.USD;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MyTest {


    @Test
    public void convertion_test() {
        USD dollatTest = new USD();
        double x = dollatTest.calculate(10);
        assertEquals(x, 35.2, "Values are not equal");
    }


}
