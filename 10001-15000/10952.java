import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = -1, b = -1;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			else {
				System.out.println(a+b);
			}
		}
	}
}
