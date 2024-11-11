import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		br.readLine();		
		char[] ch = br.readLine().toCharArray();
		
		System.out.print(Math.min(solve(ch, 'B'), solve(ch, 'R')));
	}
	
	public static int solve(char[] ch, char c) {
		int a = 0, b = 0;
		boolean flag = false;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == c) {
				flag = true;
			}
			else {
				if(flag) {
					a++;
				}
			}
		}
		
		flag = false;
		for(int i = ch.length - 1; i >= 0; i--) {
			if(ch[i] == c) {
				flag = true;
			}
			else {
				if(flag) {
					b++;
				}
			}
		}
		return Math.min(a, b);
	}
}
