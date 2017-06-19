import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int a = scan.nextInt();
		int i = a-1;
		while(i > 1){
			if(a%i ==0){
			test();	
			break;
			}
			if (i == 2){
				System.out.println("Number is prime");
			}
			i--;
		}	
	}
	public static void test(){
		System.out.println("Number is not prime");
	}

}
