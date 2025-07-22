public class fibbonic{
    public static void main(String[] args) {
        fibonacci(10);
    }
    private static void fibonacci(int n){
        if(n>1){
            System.out.println("FIBBONIC");
            if(n>=1){
                System.out.println(0+" ");
            }
            if(n>=2){
                System.out.println(1+" ");

            }
            int first =0;
            int second =1;
            for(int i=3;i<=n;i++){
                int third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;

            }
    }
     
     }
}
