import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[2];
		
		for(int i = 0; i < 2; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			num[i] += a*3 + b*2 + c;
		}
		
		if(num[0] > num[1]) {
			System.out.println("A");
		}
		else if(num[0] == num[1]) {
			System.out.println("T");
		}
		else {
			System.out.println("B");
		}
	}
}
