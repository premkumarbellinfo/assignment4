import java.util.Scanner;


public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scan.nextInt();
		System.out.println("The Fibonacci series is ");
		
		if(num == 0){
			System.out.println(num);
		}
		int ans1 = 0;
		int ans2 = 1;
		int ans3;
		System.out.print("0,1");
		for(int i= 2;i<num;i++){
		    ans3 = ans2 + ans1;
		    ans1 = ans2;
		    ans2 = ans3;
		    System.out.print(","+ ans3);
		}
		
	}

}
