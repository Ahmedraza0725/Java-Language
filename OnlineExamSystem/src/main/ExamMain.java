/*package main;

import questions.Question;
import users.User;
import java.util.Scanner;

public class ExamMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Login user
        System.out.println("Welcome to the Online Exam System!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        // Step 2: Start exam
        System.out.println("\nHello " + user.getName() + ", your exam is starting...");
        Question[] questions = Question.getSampleQuestions();
        int score = 0;

        for (Question q : questions) {
            try {
                System.out.println("\n" + q.getQuestionText());
                System.out.print("Your answer: ");
                int answer = scanner.nextInt();

                // Validate answer
                if (answer < 1 || answer > 4) {
                    throw new IllegalArgumentException("Answer must be between 1 and 4.");
                }

                // Check correctness
                if (q.isCorrectAnswer(answer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer: " + q.getCorrectOption());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear input buffer
            }
        }

        // Step 3: Show result
        System.out.println("\nExam finished! Your score: " + score + "/" + questions.length);
    }
}
*/