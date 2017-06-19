import java.util.Scanner;


public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		String num = scan.next();
		int number = Integer.parseInt(num); 
		String ans = "";
		for (int i = num.length()-1; i >= 0; i--){
			ans += num.charAt(i);
		}
		int answer = Integer.parseInt(ans);
		if (answer == number){
			System.out.println("The entered number is Palindrome Number");
		}
		else {
			System.out.println("The entered number is not Palindrome Number");
		}
	}

}
