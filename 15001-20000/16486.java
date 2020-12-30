import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		double sum = a*2 + b*2*3.141592;
		
		System.out.println(sum);
	}
}
