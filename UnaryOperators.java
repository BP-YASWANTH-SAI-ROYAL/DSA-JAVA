import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number (num1):");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number (num2):");
        int num2 = scanner.nextInt();

        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Addition : " + (num1 + num2));

        // Showing pre- and post-increment and decrement
        System.out.println("num1 after post-increment: " + (num1++));
        System.out.println("num1 after increment: " + num1);
        
        System.out.println("num1 after post-decrement: " + (num1--));
        System.out.println("num1 after decrement: " + num1);

        scanner.close();
    } 
}
