import java.util.Scanner;

public class TravelCostEstimator {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read distance to travel
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        // Read car mileage
        System.out.print("Enter mileage (km per litre): ");
        double mileage = sc.nextDouble();

        // Read petrol price per litre
        System.out.print("Enter petrol price per litre: ");
        double petrolPrice = sc.nextDouble();

        // Calculate fuel needed
        double fuelNeeded = distance / mileage;

        // Calculate total travel cost
        double cost = fuelNeeded * petrolPrice;

        // Display results
        System.out.println("Fuel needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);

        // Close Scanner
        sc.close();
    }
}