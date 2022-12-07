import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, answer = 1000000000;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][2];
		visited = new boolean[n];

		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0, 0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int depth, int sin, int ssn) {
		if(sin != 0 && ssn != 0) {
			answer = Math.min(answer, Math.abs(sin - ssn));
		}
		
		if(depth == n) {
			return;
		}
		
		for(int i = depth; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, sin == 0 ? arr[i][0] : sin * arr[i][0], ssn + arr[i][1]);
				visited[i] = false;
			}
		}
	}
}
