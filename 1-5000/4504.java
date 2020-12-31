import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(true) {
			int a = scan.nextInt();
			
			if(a == 0) {
				break;
			}
			
			if(a%num == 0) {
				System.out.println(a + " is a multiple of " + num + ".");
			}
			else {
				System.out.println(a + " is NOT a multiple of " + num + ".");
			}
		}
	}
}
