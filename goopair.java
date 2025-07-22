public class goopair {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 2};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Correct incrementing of 'j'
                if (arr[i] == arr[j]) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}
