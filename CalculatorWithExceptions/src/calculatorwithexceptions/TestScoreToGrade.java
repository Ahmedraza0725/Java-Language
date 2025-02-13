/*package calculatorwithexceptions;
import java.util.Scanner;

public class TestScoreToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for test score
            System.out.print("Enter a test score (0-100): ");
            int score = scanner.nextInt();

            // Check if score is within the valid range
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100.");
            }

            // Determine the letter grade
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the grade
            System.out.println("The equivalent letter grade is: " + grade);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a positive integer between 0 and 100.");
        } finally {
            scanner.close();
        }
    }
}
 */