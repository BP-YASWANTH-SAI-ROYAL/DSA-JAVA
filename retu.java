public class retu {

    // Method to concatenate string 'a' 'n' times
    public static String car(int n, String a) {
        String ans = "";  // Initialize 'ans' as an empty string
        for (int i = 0; i < n; i++) {  // Loop 'n' times to concatenate 'a'
            ans = ans + a;  // Concatenate 'a' to 'ans'
        }
        return ans;  // Return the concatenated result
    }

    public static void main(String[] args) {
        // Calling the method with 'n = 3' and 'a = "royal"'
        System.out.println(car(3, "royal "));  // Should print "royalroyalroyal"
    }
}
