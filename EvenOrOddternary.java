import java.util.Scanner;

class EvenOrOddternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        // Using ternary to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number is " + result);
        
        // Close the scanne
        scanner.close();
    }
}
