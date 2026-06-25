import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Default rate of interest
        final double DEFAULT_RATE = 5.0;

        // Read principal amount
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        // Read time in years
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Use default rate
        double rate = DEFAULT_RATE;

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Interest = " + simpleInterest);

        // Close Scanner
        sc.close();
    }
}