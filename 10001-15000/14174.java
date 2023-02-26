import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] alpha, answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		int[] answer = new int[26];
		
		while(n --> 0) {
			int[][] count = new int[2][26];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 2; i++) {
				for(char c : st.nextToken().toCharArray()) {
					count[i][c - 'a']++;
				}
			}
			
			for(int i = 0; i < 26; i++) {
				answer[i] += Math.max(count[0][i], count[1][i]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
