import java.util.Scanner;

public class Even{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Select the Choice : ");
		int choice = sc.nextInt();
		System.out.print("Enter the First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int b = sc.nextInt();

		switch(choice){
		case 1: System.out.println("Result : " + (a+b)); break;
		case 2: System.out.println("Result : " + (a-b)); break;
		case 3: System.out.println("Result : " + (a*b)); break;
		case 4: System.out.println("Result : " + (a/b)); break;
		default: System.out.println("Invalid Choice");	
		}
}
}