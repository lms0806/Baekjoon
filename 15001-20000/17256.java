import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[3];
		
		for(int i = 0; i < 3; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			c[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			if(i == 1) {
				b[i] = c[i] / a[i];
			}
			else {
				b[i] = c[i] - a[2-i];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(b[i]);
		}
	}
}
