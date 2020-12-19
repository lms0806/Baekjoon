import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		int[] num1 = new int[2];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		for(int i = 0; i < num1.length; i++) {
			num1[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		Arrays.sort(num1);
		
		System.out.println(num[0]+num1[0]-50);
	}
}
