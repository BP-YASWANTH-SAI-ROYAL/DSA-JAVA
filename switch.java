import java.util.Scanner;
class switchs{
    public static void main(string[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter a number of days in week");
        int day=scanner.nextInt();
        switch(day){
            case 1:
            day name= "monday";
            break;
            case 2:
            day name= "tuesday";
            break;
            case 3:
            day name= "wensday";
            break;
            case 4:
            day name= "thrusday";
            break;
            case 5:
            day name= "friday";
            break;
            case 6:
            day name= "saturday";
            break;
            case 7:
            day name= "sunday";
            break;
           default:
           dayname="invaild number"
           break;

        }
    }
}