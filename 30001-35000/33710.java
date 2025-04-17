import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		
		dfs(br.readLine(), k);
		
		System.out.print(answer);
	}
	
	public static void dfs(String s, int k) {
		answer = Math.min(answer, s.length());
		if(k == 0) {
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'X') {
				continue;
			}
			
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) != s.charAt(j)) {
					continue;
				}
				dfs(s.substring(0, i) + s.substring(j + 1), k - 1);
			}
		}
	}
}
