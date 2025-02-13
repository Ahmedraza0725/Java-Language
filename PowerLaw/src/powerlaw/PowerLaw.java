package powerlaw;
// PowerLaw.java
class PowerLaw {
    // Fields to store current, voltage, and power
    int current;
    int voltage;
    int power;

    // Method to calculate power
    void calculatePower() {
        power = current * voltage; // Power formula: P = V * I
    }

    // Method to display the output
    void display() {
        System.out.println("Current: " + current + " A");
        System.out.println("Voltage: " + voltage + " V");
        System.out.println("Power: " + power + " W");
        System.out.println("Ahmed Raza : 008");
    }
}
