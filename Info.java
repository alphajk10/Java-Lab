import java.util.Scanner;

public class Info{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the Principal : ");
		int num = sc.nextInt();
		System.out.print("Enter the Rate : ");
		int rate = sc.nextInt();
		System.out.print("Enter the Time : ");
		int time = sc.nextInt();
		double intrest = (num * rate * time)/100;
		double amount = num + intrest;

		System.out.println("Simple Intrest :" +intrest);
		System.out.println("Amount :" +amount);

		}
	}