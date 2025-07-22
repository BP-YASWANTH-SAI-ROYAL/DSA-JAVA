import java.util.Scanner;

class weeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number in week:");
        int day = scanner.nextInt();
        
        
        switch(day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid number";
                break;
        }
        
        System.out.println("Day: " + dayName);
        
        // Close the scanner
        scanner.close();
    }
}
