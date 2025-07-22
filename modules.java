class modules{
    public static void main(String[] args){
        int X[]={1,2,3,2,4,3,4,4,5,6,5,7,3,4};

        int count=0;
        for(int i=0;i<X.length;i++){
            if(X[i]%2== 0){
                count=count+1;//count++
            }
        }
        System.out.println(count);
    }
}