import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int n = 0, n1 = 0;
		
		int count = 0;
		for(int k = 0; k < num; k++) {
			for(int i = 0; i < 9; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				
				if(count != num) {
					if(a != 0 || b != 0) {
						count++;
						n+=a;
						n1+=b;
					}
				}
			}
			if(n > n1) {
				System.out.println("Yonsei");
			}
			else if(n == n1) {
				System.out.println("Korea");
			}
			else {
				System.out.println("Draw");
			}
		}
	}
}
