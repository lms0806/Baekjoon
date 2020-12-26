import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		String str = scan.next();
		String[] strs = str.split("");
		
		int sum = 0;
		for(int i = 0; i < strs.length; i++) {
			sum += Integer.parseInt(strs[i]);
		}
		System.out.println(sum);
	}
}
