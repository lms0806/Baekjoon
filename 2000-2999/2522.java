import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = n-i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n-1; i > 0; i--) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = n-i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
