import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int sum = a + b;
			
			System.out.println("Case " + (i+1) + ": " + sum);
		}
	}
}
