import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		double[] num = {350.34, 230.90, 190.55, 125.30, 180.90};
		
		for(int i = 0; i < size; i++) {
			double sum = 0;
			for(int j = 0; j < 5; j++) {
				int a = scan.nextInt();
				sum += a * num[j];
			}
			System.out.println("$" + String.format("%.2f", sum));
		}
	}
}
