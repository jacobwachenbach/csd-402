import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required in Joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed to heat the water is: " + Q + " Joules.");

        // Close the scanner object
        scanner.close();
    }
}
