import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		double[] num = new double[number];
		
		for(int i = 0; i < number; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		double max = num[number-1];
		
		double sum = 0;
		for(int i = 0; i < number; i++) {
			sum += num[i] / max * 100;
		}
		System.out.println(sum/number);
	}
}
