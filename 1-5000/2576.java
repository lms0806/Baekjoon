import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[7];
		int[] num1 = new int[7];
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i]%2 != 0) {
				num1[i] = num[i];
				sum += num[i];
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("-1");
		}
		else {
			Arrays.sort(num1);
			
			System.out.println(sum);
			for(int i = 0; i < num1.length; i++) {
				if(num1[i] != 0) {
					System.out.println(num1[i]);
					break;
				}
			}
		}
	}
}
