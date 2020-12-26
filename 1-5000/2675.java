import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for(int i = 0; i < number; i++) {
			int count = scan.nextInt();
			String str = scan.next();
			String[] strs = str.split("");
			
			for(int j = 0; j < strs.length; j++) {
				for(int k = 0; k < count; k++) {
					System.out.print(strs[j]);
				}
			}
			System.out.println();
		}
	}
}
