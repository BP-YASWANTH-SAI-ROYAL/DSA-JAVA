import java.util.Scanner;

class TernaryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week:");
        int day = scanner.nextInt();
        
        // Days of the week in an array where index 0 is unused
        String[] days = { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        
        // Using ternary to handle out-of-range numbers
        String dayName = (day >= 1 && day <= 7) ? days[day] : "Invalid number";
        
        System.out.println("Day: " + dayName);
        
        // Close the scanner
        scanner.close();
    }
}
