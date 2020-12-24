import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] s = str.split("");
		int n = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u")) {
				n++;
			}
		}
		System.out.println(n);
	}
}
