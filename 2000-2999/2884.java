import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b < 45) {
			if(a <= 0) {
				a = 24;
				a--;
				b+=60;
				b-=45;
			}
			else {
				a--;
				b+=60;
				b-=45;
			}
		}
		else {
			b-=45;
		}
		System.out.print(a + " " + b);
	}
}
