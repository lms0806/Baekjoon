import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for(int i = 0; i < number; i++) {
			double a = scan.nextDouble();
			
			double sum = a*0.8;
			System.out.println("$" + String.format("%.2f", sum));
		}
	}
}
