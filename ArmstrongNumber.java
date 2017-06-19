import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		String num = scan.next();
		int number = Integer.parseInt(num);
		int ans = 0;
		
		for (int i=0;i<num.length();i++){
			int b = 1;
			char c = num.charAt(i);
			int a = Character.getNumericValue(c);
			for (int j =1;j<=num.length();j++){
				b *= a;
			}
			ans += b;
		}
		if (ans == number){
			System.out.println("The entered number is Armstrong number");
		}
		else {
			System.out.println("The entered number is not Armstrong number");
		}
		
	}

}
