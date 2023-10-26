import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[n + 1];
		ArrayList<Integer>[] graph = new ArrayList[n], reversegraph = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
			reversegraph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				if(s.charAt(j) == '1') {
					graph[i].add(j);
					reversegraph[j].add(i);
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				dfs(i, graph, true);
			}
		}
		
		Arrays.fill(visited, false);
		
		int answer = 0;
		while(!stack.isEmpty()) {
			int u = stack.pop();
			
			if(!visited[u]) {
				answer += dfs(u, reversegraph, false);
			}
		}
		
		System.out.print(answer);
	}
	
	public static int dfs(int u, ArrayList<Integer>[] graph, boolean check) {
		int cost = arr[u];
		
		visited[u] = true;
		
		for(int a : graph[u]) {
			if(!visited[a]) {
				cost = Math.min(cost, dfs(a, graph, check));
			}
		}
		
		if(check) {
			stack.add(u);
		}
		
		return cost;
	}
}
