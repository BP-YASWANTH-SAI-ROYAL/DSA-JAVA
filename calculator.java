import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Perform operation
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero!");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid operation.");
            scanner.close();
            return;
        }

        // Output result
        System.out.println("Result: " + result);
        scanner.close();
    }
}
