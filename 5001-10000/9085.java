import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		for(int i = 0; i < size; i++) {
			int num = scan.nextInt();
			
			int sum = 0;
			for(int j = 0; j < num; j++) {
				sum += scan.nextInt();
			}
			
			System.out.println(sum);
		}
	}
}
