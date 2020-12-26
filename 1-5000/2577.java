import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a * b * c;
		
		while(d != 0) {
			int number = d % 10;
			num[number]++;
			d/=10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}
}
