import java.util.Scanner;
public class MathGuru {

	public static void main(String[] args) {
		
		boolean KeepGoing = true;
		while(KeepGoing){
			System.out.println("********************************************************************************");
			System.out.println("Function 1:Get 2^n  ");
			System.out.println("Function 2:Get the N factorial ");
			System.out.println("Function 3:Get nth number in the Fibonacci sequence");
			System.out.println("Please input a numbers represent the function to run (1 2 3).");
			System.out.println("*********************************************************************************");
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine().toUpperCase();
			
		}
	}
}