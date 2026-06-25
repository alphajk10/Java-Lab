import java.util.Scanner;

public class MobileDataUsageCalculator {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Mobile plan data limit (constant)
        final double DATA_LIMIT = 30.0;

        // Ask the user to enter data used
        System.out.print("Enter data used (in GB): ");
        double usedData = sc.nextDouble();

        // Calculate remaining data
        double remainingData = DATA_LIMIT - usedData;

        // Display the results
        System.out.println("Used: " + usedData + " GB");
        System.out.println("Remaining: " + remainingData + " GB");

        // Close Scanner
        sc.close();
    }
}
