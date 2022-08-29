import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k, answer = 0;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(500, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int num, int depth) {
		if(depth == n) {
			answer++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i] && num + arr[i] - k >= 500) {
				visited[i] = true;
				dfs(num + arr[i] - k, depth + 1);
				visited[i] = false;
			}
		}
	}
}
