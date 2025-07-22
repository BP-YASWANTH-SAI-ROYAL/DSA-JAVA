import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        String ans = "";
        
        for (int i = name.length() - 1; i >= 0; i--) {
            ans += name.charAt(i);
        }
        
        if (ans.equalsIgnoreCase(name)) { // Ignore case while comparing
            System.out.println("IT'S A PALINDROME");
        } else {
            System.out.println("IT'S NOT A PALINDROME");
        }
        
        scanner.close(); // Close the scanner
    }
}
