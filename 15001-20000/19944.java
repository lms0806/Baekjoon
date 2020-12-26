import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] s = str.split(" ");
		
		if(Integer.parseInt(s[1]) == 1 || Integer.parseInt(s[1]) == 2) {
			System.out.println("NEWBIE!");
		}
		else if(Integer.parseInt(s[0]) >= Integer.parseInt(s[1]) && Integer.parseInt(s[1]) > 2) {
			System.out.println("OLDBIE!");
		}
		else {
			System.out.println("TLE!");
		}
	}
}
