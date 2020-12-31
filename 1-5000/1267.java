import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int n = 0, n1 = 0;
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			n += a/30+1;
			n1 += a/60+1;
		}
		
		n*=10;
		n1*=15;
		
		if(n > n1) {
			System.out.println("M " + n1);
		}
		else if(n == n1) {
			System.out.println("Y M " + n);
		}
		else {
			System.out.println("Y " + n);
		}
	}
}
