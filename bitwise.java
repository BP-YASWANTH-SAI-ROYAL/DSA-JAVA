import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        //in bitwise we have OR | ,AND  &, XOR ^  ;
        System.out.print("Enter THIRD number: ");
        int num3 = scanner.nextInt();

        System.out.println("AND: " + (num1 | num2));
        System.out.println("OR: " + (num1 ^ num2));
        System.out.println("XOR: " + (num1 * num3));
        
      
        scanner.close();
    }
}
