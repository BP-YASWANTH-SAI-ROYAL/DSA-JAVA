import java.util.Scanner;

public class relations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("grether equal : " + (num1 >= num2));
        System.out.println("lesser equal: " + (num1 <= num2));
        System.out.println("not equal  : " + (num1 != num2));
        System.out.println("greather: " + (num1 > num2));
        System.out.println("lesser: " + (num1 <num2));
      
        scanner.close();
    }
}
