import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		
		int[] num = new int[n];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < a) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
