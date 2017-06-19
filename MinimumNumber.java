import java.util.Scanner;


public class MinimumNumber {

	public static void main(String[] args) {
		System.out.println("Enter 4 numbers to find the minimum number");
		
		int a = getvalue("a");
		int b = getvalue("b");
		int c = getvalue("c");
		int d = getvalue("d");
		
		if(a <= c && a <= b && a <= d){
			System.out.println(" a is smaller");	}
		else if(b <= a && b <= c && b <= d){
			System.out.println(" b is smaller");	}
		else if(c <= a && c <= b && c <= d){
			System.out.println(" c is smaller");	}
		else{
			System.out.println(" d is smaller");	}
		
	}
	public static int getvalue(String a){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of " + a);
		int x = scan.nextInt();
		return x;
	}
}
