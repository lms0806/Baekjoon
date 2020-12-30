import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(b - a > c - b) {
			System.out.println(b-a-1);
		}
		else {
			System.out.println(c-b-1);
		}
	}
}
