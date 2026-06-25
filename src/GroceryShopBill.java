import java.util.Scanner;

public class GroceryShopBill {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Discount rate (10%)
        final double DISCOUNT = 0.10;

        // Read prices of three items
        System.out.print("Enter price of Item 1: ");
        double item1 = sc.nextDouble();

        System.out.print("Enter price of Item 2: ");
        double item2 = sc.nextDouble();

        System.out.print("Enter price of Item 3: ");
        double item3 = sc.nextDouble();

        // Calculate total amount
        double total = item1 + item2 + item3;

        // Calculate discount amount
        double discountAmount = total * DISCOUNT;

        // Calculate final amount after discount
        double finalAmount = total - discountAmount;

        // Display results
        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);

        // Close Scanner
        sc.close();
    }
}