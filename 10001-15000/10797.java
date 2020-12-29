import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] num = new int[5];
		
		int result = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i] == a) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
