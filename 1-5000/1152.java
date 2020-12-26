import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] strs = str.split(" ");
		
		int answer = strs.length;
		if(str.substring(0,1).equals(" ")) {
			answer-=1;
		}
		if(answer == -1) {
			answer = 0;
		}
		System.out.println(answer);
	}
}
