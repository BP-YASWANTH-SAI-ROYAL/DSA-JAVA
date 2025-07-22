public class func {
    
    // Method to print the string 's' 'n' times
    public static void sai(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // Calling the method with different inputs
        sai(5, "darling");    // Print "darling" 5 times
        sai(99, "i love u");   // Print "i love u" 9 times
    }
}
