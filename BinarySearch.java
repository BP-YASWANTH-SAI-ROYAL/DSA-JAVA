import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");///here we enter how many eleents need in array
        int n = scanner.nextInt();

        // Taking array elements from the user
        int[] arr = new int[n];//here we declare int n into a int[] array
        System.out.println("Enter " + n + " elements (in sorted order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the target element to search for
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);//the command of binarysearch we given below the 

        // Display the result
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }

        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids potential overflow

            if (arr[mid] == target) {
                return mid;  // Target found
            } else if (arr[mid] < target) {
                left = mid + 1;  // Search in right half
            } else {
                right = mid - 1;  // Search in left half
            }
        }

        return -1;  // Target not found
    }
}


//Example of Binary Search:
//Suppose you have a sorted list [2, 4, 7, 10, 23, 35, 40, 51] and want to find the target value 23.

//First iteration:

//low = 0, high = 7
//mid = (0 + 7) / 2 = 3 (index 3, value 10)
//Since 23 > 10, search the right half (low = mid + 1 = 4).
//Second iteration:

//low = 4, high = 7
//mid = (4 + 7) / 2 = 5 (index 5, value 35)
//Since 23 < 35, search the left half (high = mid - 1 = 4).
//Third iteration:

//low = 4, high = 4
//mid = (4 + 4) / 2 = 4 (index 4, value 23)
//Match found at index 4.

