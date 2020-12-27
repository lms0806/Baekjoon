import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		while(!str.equals("END")) {
			str = scan.nextLine();
			if(str.equals("END")) {
				break;
			}
			String[] strs = str.split("");
			
			String answer = "";
			for(int i = strs.length-1; i >= 0; i--) {
				answer += strs[i];
			}
			System.out.println(answer);
		}
	}
}
