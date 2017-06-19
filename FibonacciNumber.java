import java.util.Scanner;


public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scan.nextInt();
		System.out.println("The Fibonacci series is ");
		System.out.print("1,1,2");
		int ans = 2;
		for (int i =1;i<=num-3;i++){
			ans += i;
			System.out.print(","+ ans);
		}

	}

}
