import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine().trim();
		String[] strs = str.split(" ");
		
		int answer = strs.length;
		
		if(str.equals("")) {
			answer = 0;
		}
		System.out.println(answer);
	}
}
