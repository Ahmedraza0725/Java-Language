package demo.pet;
import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter {
    private List<Pet> pets = new ArrayList<>();

    // Create
    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added successfully!");
    }

    // Read
    public void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets available for adoption.");
        } else {
            System.out.println("Pets available for adoption:");
            for (Pet pet : pets) {
                System.out.println(pet);
            }
        }
    }

    // Update
    public void updatePet(int id, String newName, int newAge, String newType, String newBreed) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                pet.setName(newName);
                pet.setAge(newAge);
                pet.setType(newType);
                pet.setBreed(newBreed);
                System.out.println("Pet details updated successfully!");
                return;
            }
        }
        System.out.println("Pet with ID " + id + " not found.");
    }

    // Delete
    public void deletePet(int id) {
        pets.removeIf(pet -> pet.getId() == id);
        System.out.println("Pet removed from the adoption list.");
    }
}

