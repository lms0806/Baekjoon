import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static char[] ch;
	static boolean[] visited;
	static StringBuilder answer = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		ch = new char[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			ch[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(ch);
		
		dfs(new StringBuilder(), 0, 0, 0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(StringBuilder sb, int depth, int which, int aeiou, int other) {
		if(depth == m) {
			if(aeiou != 0 && other > 1) {
				answer.append(sb.toString()).append("\n");
			}
			return;
		}
		
		for(int i = which; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				sb.append(ch[i]);
				which++;
				if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					dfs(sb, depth + 1, which, aeiou + 1, other);
				}
				else {
					dfs(sb, depth + 1, which, aeiou, other + 1);
				}
				sb.setLength(sb.length() - 1);
				visited[i] = false;
			}
		}
	}
}
