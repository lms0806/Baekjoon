import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String[] strs = str.split("/");
		int[] num = new int[strs.length];
		
		for(int i = 0; i < strs.length; i++) {
			num[i] = Integer.parseInt(strs[i]);
		}
		
		if(num[0] + num[2] < num[1] || num[1] == 0) {
			System.out.println("hasu");
		}
		else {
			System.out.println("gosu");
		}
	}
}
