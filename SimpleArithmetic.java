import java.util.Scanner;

public class SimpleArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("add: " + (num1 + num2));
        System.out.println("sub: " + (num1 - num2));
        System.out.println("mul: " + (num1 * num2));
        System.out.println("div: " + (num1 / num2));
        System.out.println("per: " + (num1 %num2));
      
        scanner.close();
    }
}
