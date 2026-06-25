import java.util.Scanner;
public class Distance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometer : ");
        double kilometer = sc.nextDouble();
        double meter = kilometer * 1000;
        double centimeter = meter * 100;
        System.out.println("Meters : " + meter);
        System.out.println("Centimeters : " + centimeter);
    }
}
