/*package lab03;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        // Step 1: Collect scores
        System.out.println("Enter scores (type -1 to stop):");
        while (true) {
            double score = scanner.nextDouble();
            if (score == -1) break;  // Stop when we type -1
            scores.add(score);
        }

        // Step 2: Calculate statistics
        double sum = 0;
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;
        
        for (double score : scores) {
            sum += score;
            if (score > maxScore) maxScore = score;
            if (score < minScore) minScore = score;
        }
        
        double average = sum / scores.size();
        int countAboveAverage = 0;

        for (double score : scores) {
            if (score >= average) countAboveAverage++;
        }

        // Print statistics
        System.out.printf("Average score: %.2f\n", average);
        System.out.printf("Highest score: %.2f\n", maxScore);
        System.out.printf("Lowest score: %.2f\n", minScore);
        System.out.println("Number of students scoring above or equal to average: " + countAboveAverage);

        // Step 3: For each student, calculate difference and assign grade
        for (double score : scores) {
            double difference = score - average;
            String grade;

            if (score >= 90) grade = "A";
            else if (score >= 80) grade = "B";
            else if (score >= 70) grade = "C";
            else if (score >= 60) grade = "D";
            else grade = "E";

            // Print student result
            System.out.printf("Score: %.2f, Difference from average: %.2f, Grade: %s\n", score, difference, grade);
        }
        
        scanner.close();
    }
*/