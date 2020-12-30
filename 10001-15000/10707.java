import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int p = scan.nextInt();
		
		int num1 = a*p;
		int num2 = b;
		
		if(p > c) {
			p-=c;
			num2 += d*p;
		}
		
		if(num1 > num2) {
			System.out.println(num2);
		}
		else {
			System.out.println(num1);
		}
	}
}
