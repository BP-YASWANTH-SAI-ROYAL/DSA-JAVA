import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined array
        int[] arr = {4, 2, -1, 21, 100, -3};

        // Taking the target element to search for
        System.out.print("Enter the element to search: ");//here we giving the search element
        int target = scanner.nextInt(); //here we assume the target value of given above

        // Performing linear search
        boolean found = false;// we are taking data is false or wrong so we ho to search operation to implemet 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Darling UR given element is founded dear  " + target + " found at index: " + i);
                found = true;
                break;
            }
        }

        // If the element was not found in the array
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}



//boolean found = false;: This line initializes a boolean variable found and sets it to false. It acts as a flag to indicate whether the target element has been found in the array.

//for (int i = 0; i < arr.length; i++): This for loop iterates over each element in the array arr by using the index i, which starts at 0 and goes up to arr.length - 1.

//if (arr[i] == target): Inside the loop, this if statement checks if the current array element (arr[i]) is equal to the target element we are searching for. If they match:

//System.out.println("Element " + target + " found at index: " + i);: It prints a message indicating that the target element was found and specifies its index (i) in the array.

//found = true;: The found flag is set to true, indicating that the search was successful.

//break;: The break statement terminates the loop immediately. This is because the element has been found, so there is no need to continue searching through the rest of the array.

//After the loop, if found remains false, it means the target element was not found in the array, and a message can be printed to inform the user.