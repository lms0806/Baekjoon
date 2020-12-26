import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[42];
		
		for(int i = 0; i < 10; i++) {
			int a = scan.nextInt();
			int number = a % 42;
			num[number]++;
		}
		
		int count = 0;
		
		for(int i = 0; i < 42; i++) {
			if(num[i] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
