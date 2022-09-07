import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k, answer = Integer.MIN_VALUE;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int sum, int which) {
		if(sum < k) {
			answer = Math.max(sum, answer);
		}
		
		for(int i = which; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(sum + arr[i], i);
				visited[i] = false;
			}
		}
	}
}
