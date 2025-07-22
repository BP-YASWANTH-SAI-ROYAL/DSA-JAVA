import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Triangle\n2. Rhombus\n3. Circle");
        
        int choice = scanner.nextInt();
        double area = 0;
        
        if (choice == 1) { // Triangle
            System.out.print("Enter base and height: ");
            area = 0.5 * scanner.nextDouble() * scanner.nextDouble();
        } else if (choice == 2) { // Rhombus
            System.out.print("Enter diagonals: ");
            area = 0.5 * scanner.nextDouble() * scanner.nextDouble();
        } else if (choice == 3) { // Circle
            System.out.print("Enter radius: ");
            area = Math.PI * scanner.nextDouble() * scanner.nextDouble();
        } else {
            System.out.println("Invalid choice.");
            return; // Exit if invalid choice
        }
        
        System.out.println("The area is: " + area);
        scanner.close();
    }
}