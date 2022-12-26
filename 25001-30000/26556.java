import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n, num, answer;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			arr = new int[n];
			visited = new boolean[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			answer = Integer.MAX_VALUE;
			num = Integer.parseInt(br.readLine());
			
			dfs(0, 0, 0);
			
			sb.append(answer == Integer.MAX_VALUE ? "Not possible" : answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int depth, int sum, int count) {
		if(sum == num) {
			answer = Math.min(answer, count);
			return;
		}
		
		if(depth == n) {
			return;
		}
		
		for(int i = depth; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, sum + arr[i], count + 1);
				visited[i] = false;
			}
		}
	}
}
