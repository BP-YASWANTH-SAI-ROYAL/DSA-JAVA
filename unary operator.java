import java.util.Scanner;
public class unaryoperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter a numbers1"); 
        int num1=scanner.nextInt();
        System.out.println("enter a numbers2");
        int num2=scanner.nextInt();

        System.out.println("negative: " + (num1 - num2));
        System.out.println("positive: " + (num1 + num2));
        System.out.println("increment:" +(num1++));
        System.out.println("decrement:" +(num1--));
        scanner.close();

    } 
}
