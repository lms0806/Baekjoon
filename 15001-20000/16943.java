import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int b, answer = 0;
	static String a;
	static int[] alpha = new int[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = st.nextToken();
		b = Integer.parseInt(st.nextToken());
		
		for(char c : a.toCharArray()) {
			alpha[c - '0']++;
		}
		
		dfs(0, 0);
		
		System.out.print(answer == 0 ? -1 : answer);
	}
	
	public static void dfs(int num, int depth) {
		if(depth == a.length()) {
			if(b > num && num > answer) {
				answer = num;
			}
			return;
		}
		
		for(int i = 0; i < 10; i++) {
			if(depth == 0 && i == 0) {
				continue;
			}
			if(alpha[i] != 0) {
				alpha[i]--;
				dfs(num * 10 + i, depth + 1);
				alpha[i]++;
			}
		}
	}
}
