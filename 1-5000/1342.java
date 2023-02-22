import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String str;
	static int[] alpha;
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		alpha = new int[26];
		
		str = br.readLine();
		for(char c : str.toCharArray()) {
			alpha[c - 'a']++;
		}
		
		dfs(0, "");
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, String s) {
		if(depth == str.length()) {
			answer++;
			return;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alpha[i] == 0 || (s.length() > 0 && s.charAt(s.length() - 1) == i + 'a')) {
				continue;
			}
			
			alpha[i]--;
			dfs(depth + 1, s + (char)(i + 'a'));
			alpha[i]++;
		}
	}
}
