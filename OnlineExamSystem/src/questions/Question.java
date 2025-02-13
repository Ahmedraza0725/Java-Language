/*package questions;

public class Question {
    private String questionText;
    private String[] options;
    private int correctOption;

    // Constructor
    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    // Getter for question text
    public String getQuestionText() {
        return questionText + "\nOptions:\n1. " + options[0] + "\n2. " + options[1] + "\n3. " + options[2] + "\n4. " + options[3];
    }

    // Check if answer is correct
    public boolean isCorrectAnswer(int answer) {
        return answer == correctOption;
    }

    // Get correct option
    public int getCorrectOption() {
        return correctOption;
    }

    // Sample questions
    public static Question[] getSampleQuestions() {
        return new Question[] {
            new Question("What is the capital of France?", new String[] {"Paris", "London", "Rome", "Berlin"}, 1),
            new Question("What is 2 + 2?", new String[] {"3", "4", "5", "6"}, 2),
            new Question("What is the largest planet?", new String[] {"Earth", "Mars", "Jupiter", "Saturn"}, 3)
        };
    }
}
*/