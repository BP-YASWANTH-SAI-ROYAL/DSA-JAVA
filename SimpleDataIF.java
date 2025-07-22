import java.util.Scanner;

public class SimpleDataIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); 
        
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Display the information
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("wow yaar ur " + color + " is myfavorite color.");import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declaring the array
        int[] arr = new int[n];

        // Taking array elements input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the target element to search for
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Performing linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

        // Corrected age conditions
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else if (age >= 668&& age < 100) {
            System.out.println("You are an old.");
        }else {
            System.out.println("You are a senior citizen.");
        }

        // Close the scanner
        scanner.close();
    }
}
