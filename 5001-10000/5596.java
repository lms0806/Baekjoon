import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String str1 = scan.nextLine();
		
		String[] a = str.split(" ");
		String[] b = str1.split(" ");
		
		int num = Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]) + Integer.parseInt(a[3]);
		int num1 = Integer.parseInt(b[0]) + Integer.parseInt(b[1]) + Integer.parseInt(b[2]) + Integer.parseInt(b[3]);
		
		if(num >= num1) {
			System.out.println(num);
		}
		else {
			System.out.println(num1);
		}
	}
}
