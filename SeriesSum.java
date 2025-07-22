public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;
        
        for (int i = 1; i <= 10; i++) {
            double numerator =i;
            double denominator=i+1;

            
            //s=1/2-2/3+3/4- up to -10/11  here even getting minus and odd getting the plus
            if (i % 2 == 0) {
                sum -= numerator/denominator;
            } else {
                sum += numerator/denominator;
            }
        }
        
        System.out.println("The sum of the series is:  " + sum);
    }
}
