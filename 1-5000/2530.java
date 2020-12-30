import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		c += d;
		
		b += c/60;
		c%=60;
		
		a += b/60;
		b %= 60;
		
		a %= 24;
		
		System.out.println(a + " " + b + " " + c);
	}
}
