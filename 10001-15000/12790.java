import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] a = new int[4];
		int[] b = new int[4];
		
		for(int i = 0; i < num; i++) {
			int sum = 0;
			
			for(int j = 0; j < 4; j++) {
				a[j] = scan.nextInt();
			}
			for(int j = 0; j < 4; j++) {
				b[j] = scan.nextInt() + a[j];
			}
			
			if(b[0] < 1) {
				b[0] = 1;
			}
			if(b[1] < 1) {
				b[1] = 1;
			}
			if(b[2] < 0) {
				b[2] = 0;
			}
			
			sum = b[0] + 5*b[1] + 2*b[2] + 2*b[3];
			System.out.println(sum);
		}
	}
}
