import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < n; i++) {
			int num = scan.nextInt();
			if(num == 1) {
				a++;
			}
			else {
				b++;
			}
		}
		if(a > b) {
			System.out.println("Junhee is cute!");
		}
		else {
			System.out.println("Junhee is not cute!");
		}
	}
}
