/**
 * A simple class to perform Min Max Calculations
 */
public class MinMaxCalculation {

    public static void main(String ... args) {
    }

    /**
     * Compute the maximum of an array of numbers.
     */
    public static double maximumOfNumbers(double ... numbers) {
        if(numbers.length == 0) {
            return -1;
        }
        double maximum = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if(numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    /**
     * Compute the minimum of an array of numbers.
     */
    public static double minimumOfNumbers(double ... numbers) {
        if(numbers.length == 0) {
            return -1;
        }
        double minimum = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if(numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

}