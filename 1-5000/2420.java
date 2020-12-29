import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		long result = Math.abs(a-b);
		System.out.println(result);
	}
}
