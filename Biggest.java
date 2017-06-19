import java.util.Scanner;


public class Biggest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter number here");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		int d = i.nextInt();
		
		if(a>c && a>b && a>d){
			System.out.println(" a is bigger");	}
		else if(b>a && b>c && b>d){
			System.out.println(" b is bigger");	}
		else if(c>a && c>b && c>d){
			System.out.println(" c is bigger");	}
		else if(d>c && d>b && d>c){
			System.out.println(" d is bigger");	}
	}
}
	
