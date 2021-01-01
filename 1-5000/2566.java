import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int x = 0, y = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int a = scan.nextInt();
				if(a > max) {
					max = a;
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((x+1) + " " + (y+1));
	}
}
