import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 1, b = 1, c = 1;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			int tmp = 0;
			if(a > b && a > c) {
				tmp = c;
				c = a;
				a = tmp;
			}
			else {
				if(b > c) {
					tmp = c;
					c = b;
					b = tmp;
				}
			}
			
			if(c*c == (a*a) + (b*b)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
