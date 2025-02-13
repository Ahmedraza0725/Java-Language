package powerlaw;
public class mainmethod {
    public static void main(String[] args) {
        // Create an object of PowerLaw class
        PowerLaw powerLaw = new PowerLaw();

        // Assign values to current and voltage
        powerLaw.current = 5; // Example: 5 Amperes
        powerLaw.voltage = 220; // Example: 220 Volts

        // Calculate power and display the output
        powerLaw.calculatePower();
        powerLaw.display();
    }
}