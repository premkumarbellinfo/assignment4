import java.util.Scanner;


public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scan.nextInt();
		int ans =0;
		for(int i =1;i<num;i++){
			if(num%i == 0){
				ans += i;
			}
		}
		if (ans == num){
			System.out.println(num + " is a perfect number");
		}
		else{
			System.out.println(num + " is not a perfect number");
		}
	}
}
