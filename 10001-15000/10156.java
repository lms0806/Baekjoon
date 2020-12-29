import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result = a*b - c;
		
		if(result < 0) {
			result = 0;
		}
		System.out.println(result);
	}
}
