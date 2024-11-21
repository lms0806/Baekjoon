import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			if(solve(alpha, s.toCharArray())) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int[] alpha, char[] ch) {
		int[] num = alpha.clone();
		for(char c : ch) {
			if(num[c - 'a'] == 0) {
				return false;
			}
			num[c - 'a']--;
		}
		return true;
	}
}
