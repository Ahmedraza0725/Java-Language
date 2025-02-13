/*package numberconversion;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Initialize an array to store 10 integers
            int[] originalArray = new int[10];

            // Take input from the user
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                originalArray[i] = scanner.nextInt();
            }

            // Display odd values with their indexes
            System.out.println("Odd values with their indexes:");
            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] % 2 != 0) {
                    System.out.println(originalArray[i] + " found at index= " + i);
                }
            }

            // Create a copy of the original array
            int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

            // Display the copied array
            System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}*/