import java.util.Scanner;
public class evenandodd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();

        if( num%2==0){
            System.out.println("  number even");
        } else{
            System.out.println(" number is odd");
        }
    }
    
}
