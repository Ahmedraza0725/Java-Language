package lab03;
import java.util.Random;

public class Temperature {
    public static void main(String[] args) {
        Random random = new Random();
        int numLocations = 10;

        // Loop through each location
        for (int location = 1; location <= numLocations; location++) {
            double totalTemperature = 0;
            int days = 365;

            // Generate random temperatures for each day of the year
            for (int day = 0; day < days; day++) {
                double temperature = -10 + random.nextDouble() * 45; // Between -10 and 35
                totalTemperature += temperature;
            }

            // Calculate the average temperature for the location
            double averageTemperature = totalTemperature / days;
            System.out.printf("Average temperature at location %d = %.7f\n", location, averageTemperature);
        }
    }
}