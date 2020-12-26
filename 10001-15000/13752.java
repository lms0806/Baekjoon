import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = scan.nextInt();	
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < num[i]; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}
