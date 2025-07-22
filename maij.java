import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        int charge;

        if (weight <= 10) {
            charge = weight * 20;
        } else if (weight <= 20) {
            charge = weight * 50;
        } else if (weight <= 30) {
            charge = weight * 100;
        } else {
            charge = weight * 150; // Assuming charge rate for weight > 30
        }

        System.out.println("Charge: " + charge);
        scanner.close();
    }