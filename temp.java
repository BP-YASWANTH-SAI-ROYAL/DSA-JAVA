class temp{
    public static void main(String[] args){
        int X[]={1,2,3,2,4,3,4,4,5,6,5,7,3,4};

        int count=0;
        for(int i=0;i<X.length;i++){
            int temp =X[i];
            if(temp%2== 0 || temp%3== 0)
            {
                count=count+1;//count++
            }
        }
        System.out.println(count);
    }
}