public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;
        
        for (int i = 1; i <= 10; i++) {
            double numerator = i;
            double denominator = factorial(i);

            // s = 1/1! - 2/2! + 3/3! - ... up to -10/10!
            if (i % 2 == 0) {
                sum -= numerator / denominator;
            } else {
                sum += numerator / denominator;
            }
        }
        
        System.out.println("The sum of the series is: " + sum);
    }
    
    // Method to calculate factorial
    public static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
