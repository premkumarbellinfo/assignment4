import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		String num = scan.next();
		System.out.println("The reversed number is");
		for (int i=num.length()-1; i >= 0; i--){
			System.out.print(num.charAt(i));
		}

	}

}
