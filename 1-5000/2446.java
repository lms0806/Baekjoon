import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		for(int i = n; i > 1; i--) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
