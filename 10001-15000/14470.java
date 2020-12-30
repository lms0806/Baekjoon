import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		int sum = 0;
		if(a < 0) {
			sum = Math.abs(a)*c + d + b*e;
		}
		else if(a == 0) {
			sum = d + b*e;
		}
		else {
			sum = (b-a)*e;
		}
		
		System.out.println(sum);
	}
}
