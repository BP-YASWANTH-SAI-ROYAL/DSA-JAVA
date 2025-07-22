public class maxinarray {
    public static void main(String[] args) {
        int arr[] ={4,66,33,11,77,4};
        int ans=0;
        for(int i=0;i<arr.length;i++){

           // if(arr[i]>ans){
                //ans=arr[i];
            ans=Math.max(arr[i],ans);
            }
            System.out.println(ans);
        }

        
    }
    

