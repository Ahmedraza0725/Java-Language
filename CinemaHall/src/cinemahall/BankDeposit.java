/*package cinemahall;
import java.util.Scanner;
// Custom exception class
class InvalidDepositAmountException extends Exception {
    public InvalidDepositAmountException(String message) {
        super(message);
    }
}
// Main class to handle deposit
public class BankDeposit {
    // Method to handle deposit
    public static void depositMoney(int amount) throws InvalidDepositAmountException {
        if (amount < 1000 || amount > 50000) {
            throw new InvalidDepositAmountException("Error: Deposit amount must be between 1,000 and 50,000.");
        }
        System.out.println("Money has been deposited: " + amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for deposit amount
            System.out.print("Enter the amount to deposit: ");
            int amount = scanner.nextInt();

            // Attempt to deposit money
            depositMoney(amount);

        } catch (InvalidDepositAmountException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
*/