import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[9];
		
		int max = num[0];
		int index = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
				index = i+1;
			}
		}
		
		System.out.println(max + "\n" + index);
	}
}
