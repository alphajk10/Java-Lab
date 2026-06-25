import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        // Create Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the current year
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter current Month: ");
        int currentmonth = sc.nextInt();

        // Ask the user to enter the birth year
        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter Birth Month: ");
        int birthmonth = sc.nextInt();

        // Calculate age by subtracting birth year from current year
        int age = currentYear - birthYear;

        if (birthmonth > currentmonth)
        {
            age = age - 1;
        }

        // Display the calculated age
        System.out.println("Age = " + age);

        // Close the Scanner to free system resources
        sc.close();
    }
}