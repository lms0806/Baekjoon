import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] num = new int[a];
		
		for(int i = 0; i < a; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			num[i] = b+c;
		}
		
		for(int i = 1; i <= a; i++) {
			System.out.println("Case #" + i + ": " + num[i-1]);
		}
	}
}
