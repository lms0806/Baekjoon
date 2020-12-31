import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int sum = Math.abs(a-b-2);
			System.out.println(sum);
		}
	}
}
