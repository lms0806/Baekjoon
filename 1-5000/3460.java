import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			String str = Integer.toBinaryString(a);
			String[] strs = str.split("");
			
			for(int j = strs.length-1; j >= 0; j--) {
				if(strs[j].equals("1")) {
					System.out.println(strs.length-j-1);
				}
			}
		}
	}
}
