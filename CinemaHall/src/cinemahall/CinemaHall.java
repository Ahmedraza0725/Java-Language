/*package cinemahall;
import java.util.Scanner;

// Custom exception class
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class CinemaHall {
    // Method to check age eligibility
    public static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You are not eligible to enter the cinema hall. Minimum age is 18.");
        }
        System.out.println("You are eligible to enter the cinema hall. Enjoy the movie!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input age from the user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check age using the custom method
            checkAge(age);

        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
}*/