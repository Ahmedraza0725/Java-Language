package lab04;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        // Scanner to get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        
        // Read the email input
        String email = sc.nextLine();
        
        // Find the index positions for "@" and "."
        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");
        
        // Extract username, domain, and extension
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1, dotIndex);
        String extension = email.substring(dotIndex + 1);
        
        // Print the extracted information
        System.out.println("User name = " + username);
        System.out.println("Domain = " + domain);
        System.out.println("Extension = " + extension);
        
        sc.close();
    }
}
