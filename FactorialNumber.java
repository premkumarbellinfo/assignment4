import java.util.Scanner;


public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scan.nextInt();
		double ans = 1;
		for (int i=num;i>0;i--){
			ans *= i;
		}
		System.out.println("The factorial of " + num + " is " + ans);
	}

}
