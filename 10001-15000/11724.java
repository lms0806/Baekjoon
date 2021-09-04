import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] graph;
	static boolean[] visited;
	static int n, m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][n];
		visited = new boolean[n];
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		int answer = 0;
		for(int i = 0; i < visited.length; i++) {
			if(!visited[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void dfs(int index) {
		if(visited[index]) {
			return;
		}
		
		visited[index] = true;
		for(int i = 0; i < n; i++) {
			if(graph[index][i] == 1) {
				dfs(i);
			}
		}
	}
}
