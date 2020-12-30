import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int num = a * 30 + b;
		
		if(num == 78) {
			System.out.println("Special");
		}
		else if(num > 78) {
			System.out.println("After");
		}
		else {
			System.out.println("Before");
		}
	}
}
