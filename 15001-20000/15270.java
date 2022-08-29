import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m, answer = 0;
	static boolean[] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m][2];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()) - 1;
			arr[i][1] = Integer.parseInt(st.nextToken()) - 1;
		}
		
		visited = new boolean[n];
		dfs(0, 0);
		
		answer *= 2;
		
		if(answer < n) {
			answer++;
		}
		
		System.out.print(answer);
	}
	
	public static void dfs(int num, int depth) {
		if(depth == m) {
			answer = Math.max(answer, num);
			return;
		}
		
		if(visited[arr[depth][0]] || visited[arr[depth][1]]) {
			dfs(num, depth + 1);
		}
		else {
			visited[arr[depth][0]] = true;
			visited[arr[depth][1]] = true;
			
			dfs(num + 1, depth + 1);
			
			visited[arr[depth][0]] = false;
			visited[arr[depth][1]] = false;
			
			dfs(num, depth + 1);
		}
	}
}
