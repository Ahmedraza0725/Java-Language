/*package numberconversion;
import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for birth month
            System.out.print("Enter your birth month (1-12): ");
            int month = scanner.nextInt();

            // Prompt user for birth day
            System.out.print("Enter your birth day (1-31): ");
            int day = scanner.nextInt();

            // Validate input
            if (month < 1 || month > 12 || day < 1 || day > 31) {
                throw new IllegalArgumentException("Invalid date. Please enter a valid month and day.");
            }

            // Determine zodiac sign
            String zodiacSign = "";
            switch (month) {
                case 1:
                    zodiacSign = (day <= 19) ? "Capricorn" : "Aquarius";
                    break;
                case 2:
                    if (day > 29) throw new IllegalArgumentException("Invalid date. February has at most 29 days.");
                    zodiacSign = (day <= 18) ? "Aquarius" : "Pisces";
                    break;
                case 3:
                    zodiacSign = (day <= 20) ? "Pisces" : "Aries";
                    break;
                case 4:
                    if (day > 30) throw new IllegalArgumentException("Invalid date. April has only 30 days.");
                    zodiacSign = (day <= 19) ? "Aries" : "Taurus";
                    break;
                case 5:
                    zodiacSign = (day <= 20) ? "Taurus" : "Gemini";
                    break;
                case 6:
                    if (day > 30) throw new IllegalArgumentException("Invalid date. June has only 30 days.");
                    zodiacSign = (day <= 20) ? "Gemini" : "Cancer";
                    break;
                case 7:
                    zodiacSign = (day <= 22) ? "Cancer" : "Leo";
                    break;
                case 8:
                    zodiacSign = (day <= 22) ? "Leo" : "Virgo";
                    break;
                case 9:
                    if (day > 30) throw new IllegalArgumentException("Invalid date. September has only 30 days.");
                    zodiacSign = (day <= 22) ? "Virgo" : "Libra";
                    break;
                case 10:
                    zodiacSign = (day <= 22) ? "Libra" : "Scorpio";
                    break;
                case 11:
                    if (day > 30) throw new IllegalArgumentException("Invalid date. November has only 30 days.");
                    zodiacSign = (day <= 21) ? "Scorpio" : "Sagittarius";
                    break;
                case 12:
                    zodiacSign = (day <= 21) ? "Sagittarius" : "Capricorn";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid month.");
            }

            // Display zodiac sign
            System.out.println("Your Zodiac sign is: " + zodiacSign);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values for month and day.");
        } finally {
            scanner.close();
        }
    }
}*/
