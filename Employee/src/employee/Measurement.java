package employee;
public class Measurement {
    // Fields for measurements
    double km, meter, millimeter;

    // Constructor to initialize values
    Measurement(double km, double meter, double millimeter) {
        this.km = km;
        this.meter = meter;
        this.millimeter = millimeter;
    }

    // Method to return the rounded-off kilometer
    int roundOffKilometer() {
        return (int) Math.round(km);
    }

    // Method to return the rounded-off meter
    int roundOffMeter() {
        return (int) Math.round(meter);
    }

    // Method to return the rounded-off millimeter
    int roundOffMillimeter() {
        return (int) Math.round(millimeter);
    }

    // Display method
    void display() {
        System.out.println("Kilometers: " + roundOffKilometer());
        System.out.println("Meters: " + roundOffMeter());
        System.out.println("Millimeters: " + roundOffMillimeter());
    }
}
