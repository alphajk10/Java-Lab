import java.util.Scanner;

public class Arra{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		System.out.println("Enter the Numbers in Array : ");
		for(int i = 0 ; i < num ; i++){
			arr[i] = sc.nextInt();
		}
		int positive = 0;
		int negative = 0;
		int zero = 0;

		for(int i = 0 ; i < num ; i++){
			if(arr[i] > 0){
				positive ++;
		}
			else if(arr[i] < 0){
				negative ++;
		}
			else{
				zero ++;
		}
		}
		System.out.println("Positive : " +positive);
		System.out.println("Negative : " +negative);
		System.out.println("Zero : " +zero);

}
}
