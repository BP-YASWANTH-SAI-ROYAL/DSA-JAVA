import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the units: ");
        int units = scanner.nextInt();

        if (units < 0) {
            System.out.println("Invalid input");
        } else if (units < 100) {
            System.out.println("80 paise per unit");
        } else if (units <= 200) {
            System.out.println("1 rupee per unit");
        } else {
            System.out.println("1.25 rupee per unit");
        }

        scanner.close();
    }
}


    