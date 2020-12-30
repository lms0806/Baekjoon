import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				sum += scan.nextInt();
			}
			if(sum == 1) {
				System.out.println("C");
			}
			else if(sum == 2) {
				System.out.println("B");
			}
			else if(sum == 3) {
				System.out.println("A");
			}
			else if(sum == 4) {
				System.out.println("E");
			}
			else {
				System.out.println("D");
			}
			sum = 0;
		}
	}
}
