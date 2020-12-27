import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		while(!str.equals("0")) {
			str = scan.next();
			if(str.equals("0")) {
				break;
			}
			String[] strs = str.split("");
			
			int count = 0;
			for(int i = 0; i < strs.length; i++) {
				if(strs[i].equals(strs[strs.length-i-1])){
					count++;
				}
			}
			if(count == strs.length) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
