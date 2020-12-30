import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = scan.nextInt();
		for(int i = 0; i < 9; i++) {
			sum -= scan.nextInt();
		}
		System.out.println(sum);
	}
}
