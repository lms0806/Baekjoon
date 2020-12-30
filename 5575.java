import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = 0, m = 0, s = 0;
		int num = 0;
		
		int result = 0;
		for(int i = 0; i < 3; i++) {
			h = scan.nextInt();
			m = scan.nextInt();
			s = scan.nextInt();
			num = h * 3600 + m * 60 + s;
			
			h = scan.nextInt();
			m = scan.nextInt();
			s = scan.nextInt();
			result = h * 3600 + m * 60 + s;
			result -= num;
			
			System.out.println(result/3600 + " " + (result%3600)/60 + " " + result%60);
		}	
	}
}
