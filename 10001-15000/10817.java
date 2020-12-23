import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.print(num[1]);
	}
}
