class count{
    public static void main(String[] args){
        int x[]={1,2,3,2,4,3,4,4,5,6,5,7,3,4};

        int count=0;
        for(int i=0;i<=14;i++){
            if(x[i]==4){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}