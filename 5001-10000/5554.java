import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int num = scan.nextInt();
			sum += num;
		}
		
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}
