import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("0");
		}
		else if(a%5 == 0){
			System.out.println((a/5));
		}
		else {
			System.out.println((a/5)+1);
		}
	}
}
