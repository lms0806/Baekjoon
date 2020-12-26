import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] bn = new int[a];
		int[] cn = new int[a];
		int[] num = new int[a];
		
		for(int i = 0; i < a; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			bn[i] = b;
			cn[i] = c;
			num[i] = b+c;
		}
		
		for(int i = 1; i <= a; i++) {
			System.out.println("Case #" + i + ": " + bn[i-1] + " + " + cn[i-1] + " = " + num[i-1]);
		}
	}
}
