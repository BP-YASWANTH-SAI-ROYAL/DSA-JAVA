public class pattss {
    public static void main(String[] args){ 
        int n=5;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
                }
                for(int k=0;k<i*2+1;k++){
                    System.out.print("*");
                    }
                System.out.println(); 
        }         
    }
}

