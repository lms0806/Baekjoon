import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		boolean[] upperAlpha = new boolean[26], lowerAlpha = new boolean[26];
		
		for(char c : s.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				upperAlpha[c - 'A'] = true;
			}
			else {
				lowerAlpha[c - 'a'] = true;
			}
		}
		
		int[] num = {1, 6, 8, 14, 17, 21, 24};
		
		int upper = 0, lower = 0;
		for(int i = 0; i < num.length; i++) {
			if(upperAlpha[num[i]]) {
				upper++;
			}
			if(lowerAlpha[num[i]]) {
				lower++;
			}
		}
		
		System.out.print(upper == 7 ? lower == 7 ? "YeS" : "YES" : lower == 7 ? "yes" : "NO!");
	}
}
