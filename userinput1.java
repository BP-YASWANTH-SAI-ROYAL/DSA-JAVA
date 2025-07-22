import java.util.Scanner;
class userinput1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the user name1");
        String name1 = scanner.nextLine();
        System.out.println("enter the user name2");
        String name2 =scanner.nextLine();

        System.out.println("given full name :"+(name1 + name2));

    }
}
