import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int sum = scan.nextInt();
			sum += scan.nextInt();
			
			if(sum == 0) {
				break;
			}
			
			System.out.println(sum);
		}
	}
}
