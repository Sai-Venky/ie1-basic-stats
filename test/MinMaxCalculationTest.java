import org.junit.Test;
import static org.junit.Assert.*;

public class MinMaxCalculationTest {
    private static double EPS = 1e-9;

    @Test
    public void testMaximum() {
      double[] numbers = {9, 11, 1, 4, 7, 21};
      double maximum = MinMaxCalculation.maximumOfNumbers(numbers);
      assertEquals (21, maximum, EPS);

      double[] numbers2 = {};
      maximum = MinMaxCalculation.maximumOfNumbers(numbers2);
      assertEquals (-1, maximum, EPS);
    }

    @Test
    public void testMinimum() {
      double[] numbers = {9, 11, 1, 4, 7, 21};
      double minimum = MinMaxCalculation.minimumOfNumbers(numbers);
      assertEquals (1, minimum, EPS);

      double[] numbers2 = {};
      minimum = MinMaxCalculation.minimumOfNumbers(numbers2);
      assertEquals (-1, minimum, EPS);
    }

}