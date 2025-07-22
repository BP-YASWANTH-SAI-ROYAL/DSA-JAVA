public class patt {
    public static void main(String[] args){ 
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
                }
                for(int k=0;k<3;k++){
                    System.out.print("*");
                }
                for(int l=0;l<1;l++){
                    System.out.print("_");
                }
                System.out.println(); 
        }         
    }
}

