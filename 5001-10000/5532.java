import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int num1 = 0, num2 = 0;
		int result = 0;
		
		if(a%c != 0) {
			num1= a/c +1;
		}
		else {
			num1 = a/c;
		}
		
		if(b%d != 0) {
			num2 = b/d + 1;
		}
		else {
			num2 = b/d;
		}
		
		if(num1 > num2) {
			result = l - num1;
		}
		else {
			result = l - num2;
		}
		
		System.out.println(result);
	}
}
