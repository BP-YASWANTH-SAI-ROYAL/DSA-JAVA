import java.util.Scanner;
class userinput1{
    public static void main(String[],args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter the user name");
        Scanner name1=Scanner.nextInt();
        System.out.println("enter the user name 2");
        Scanner name2=Scanner.nextInt();

        System.out.println("given full name :"+(name1 + name2));



    }
}