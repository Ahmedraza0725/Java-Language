/*package calculatorwithexceptions;
import java.util.Scanner;

public class CalculatorWithExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform calculation
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
            }

            // Display result
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        } finally {
            scanner.close();
        }
    }
}*/
