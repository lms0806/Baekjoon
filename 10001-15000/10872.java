import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int num = 1;
		for(int i = 1; i <= n; i++) {
			num*=i;
		}
		System.out.println(num);
	}
}
