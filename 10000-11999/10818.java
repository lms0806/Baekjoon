import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] num = new int[a];
		
		for(int i = 0; i < a; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[num.length-1]);
	}
}
