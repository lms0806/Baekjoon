import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int sum = 0;
			int n = 0;
			for(int j = 0; j < 7; j++) {
				int a = scan.nextInt();
				if(a % 2 == 0) {
					if(n == 0 || n > a) {
						n = a;
					}
					sum += a;
				}
			}
			System.out.println(sum + " " + n);
		}
	}
}
