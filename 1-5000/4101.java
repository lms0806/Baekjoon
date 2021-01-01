import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a > b) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
