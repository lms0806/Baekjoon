import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a*b;
		
		for(int i = 0; i < 5; i++) {
			int c = scan.nextInt();
			System.out.println(c-sum);
		}
	}
}
