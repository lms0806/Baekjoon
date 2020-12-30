import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String[] strs = str.split("");
		
		String a = "", b= "";
		if(strs.length > 2) {
			if(strs[strs.length-1].equals("0")) {
				for(int i = 0; i < strs.length-2; i++) {
					a += strs[i];
				}
				b += strs[strs.length-2] + strs[strs.length-1];
			}
			else {
				for(int i = 0; i < strs.length-1; i++) {
					a += strs[i];
				}
				b += strs[strs.length-1];
			}
		}
		else {
			a += strs[0];
			b += strs[1];
		}
		
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		
		System.out.println(sum);
	}
}
