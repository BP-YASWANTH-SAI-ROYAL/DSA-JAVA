public class Stringexchange {
    public static void main(String[] args) {
        String x = "royal";
        // Looping from the last index to the first index
        for (int i = x.length()-1 ; i >= 0; i--) {
            System.out.print(x.charAt(i)); // Print the character at index i
        }
    }
}
