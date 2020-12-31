import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double n = Math.sqrt((double)(b*b + c*c));
		
		for(int i = 0; i < a; i++) {
			int num = scan.nextInt();
			if((b*b)+(c*c) >= num*num) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}
}
