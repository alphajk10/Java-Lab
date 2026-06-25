import java.util.Scanner;
public class Electricity {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        final double RATE_PER_UNIT = 7.5;

        System.out.print("Enter the Number of Units Consumed : ");
        int unitconsumed = sc.nextInt();

        double total = unitconsumed * RATE_PER_UNIT;
        System.out.println("Electricity Consumed : " + total);
    }
}
