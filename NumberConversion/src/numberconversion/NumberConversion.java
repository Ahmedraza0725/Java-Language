/*package numberconversion;
import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for an integer
            System.out.print("Enter an integer: ");
            long number = scanner.nextLong();

            // Check if the number is within the range of Integer
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                int intNumber = (int) number;

                // Convert and display using Integer wrapper class
                System.out.println("Binary (Integer): " + Integer.toBinaryString(intNumber));
                System.out.println("Hexadecimal (Integer): " + Integer.toHexString(intNumber));
                System.out.println("Octal (Integer): " + Integer.toOctalString(intNumber));
            } else {
                // Convert and display using Long wrapper class
                System.out.println("Binary (Long): " + Long.toBinaryString(number));
                System.out.println("Hexadecimal (Long): " + Long.toHexString(number));
                System.out.println("Octal (Long): " + Long.toOctalString(number));
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}*/