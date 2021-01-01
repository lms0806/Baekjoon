import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 100, sum1 = 100;
		
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a > b) {
				sum1 -= a;
			}
			else if(a < b){
				sum -= b;
			}
		}
		
		System.out.println(sum);
		System.out.println(sum1);
	}
}
