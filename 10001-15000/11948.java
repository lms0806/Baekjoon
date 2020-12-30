import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		int sum = 0, num = 0;
		for(int i = 0; i < 4; i++) {
			a = scan.nextInt();
			if(i == 0) {
				num = a;
			}
			else if(a > num) {
				sum += a;
			}
			else {
				sum += num;
				num = a;
			}
		}
		
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(b > c) {
			sum += b;
		}
		else {
			sum += c;
		}
		System.out.println(sum);
	}
}
