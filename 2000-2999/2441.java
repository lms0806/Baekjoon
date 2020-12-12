import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = a - i; j < a; j++) {
				System.out.print(" ");
			}
			for(int j = a - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
