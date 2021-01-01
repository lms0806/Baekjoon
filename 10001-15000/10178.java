import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int num = a/b;
			int num1 = a%b;
			
			System.out.println("You get " + num + " piece(s) and your dad gets " + num1 + " piece(s).");
		}
	}
}
