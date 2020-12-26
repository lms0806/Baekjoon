import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		String[] strs1 = str1.split("");
		String[] strs2 = str2.split("");
		
		String strss1 = "";
		String strss2 = "";
		
		for(int i = strs1.length-1; i > -1; i--) {
			strss1 += strs1[i];
		}
		for(int i = strs2.length-1; i > -1; i--) {
			strss2 += strs2[i];
		}
		
		int num1 = Integer.parseInt(strss1);
		int num2 = Integer.parseInt(strss2);
		
		if(num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}
