import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int sum = scan.nextInt();
			int number = scan.nextInt();
			for(int j = 0; j < number; j++) {
				int q = scan.nextInt();
				int p = scan.nextInt();
				
				sum += q*p;
			}
			System.out.println(sum);
		}
	}
}
