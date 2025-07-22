import java.util.Scanner;

public class NameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().toLowerCase();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.println("Converted Name: " + firstName + " " + lastName);

        scanner.close();
    }
}
