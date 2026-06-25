import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Fahrenheit = " + fahrenheit);

        // Close the Scanner
        sc.close();
    }
}