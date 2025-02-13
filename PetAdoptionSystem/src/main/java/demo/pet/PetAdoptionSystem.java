package demo.pet;
import java.util.Scanner;

public class PetAdoptionSystem {
    public static void main(String[] args) {
        AdoptionCenter adoptionCenter = new AdoptionCenter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Pet Adoption System ---");
            System.out.println("1. Add Pet");
            System.out.println("2. View Pets");
            System.out.println("3. Update Pet");
            System.out.println("4. Delete Pet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Pet ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Pet Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Pet Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Pet Type (e.g., Dog, Cat): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Pet Breed: ");
                    String breed = scanner.nextLine();
                    adoptionCenter.addPet(new Pet(id, name, age, type, breed));
                }
                case 2 -> adoptionCenter.viewPets();
                case 3 -> {
                    System.out.print("Enter Pet ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Type: ");
                    String newType = scanner.nextLine();
                    System.out.print("Enter New Breed: ");
                    String newBreed = scanner.nextLine();
                    adoptionCenter.updatePet(updateId, newName, newAge, newType, newBreed);
                }
                case 4 -> {
                    System.out.print("Enter Pet ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    adoptionCenter.deletePet(deleteId);
                }
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



