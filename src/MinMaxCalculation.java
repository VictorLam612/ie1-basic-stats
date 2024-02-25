import java.util.*;

public class MinMaxCalculation {
    /**
     * Compute the min of an array of numbers;.
     */
    public static double min(double ... numbers) {
        double min = numbers[0];
        for (double num : numbers) {
            min = Math.min(min, num);
        }

        return min;
    }

    /**
     * Compute the max of an array of numbers;.
     */
    public static double max(double ... numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            max = Math.max(max, num);
        }

        return max;
    }
}