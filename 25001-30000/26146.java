import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
		
		visited = new boolean[v + 1];
		ArrayList<Integer>[] graph = new ArrayList[v + 1], reversegraph = new ArrayList[v + 1];
		
		for(int i = 1; i <= v; i++) {
			graph[i] = new ArrayList<>();
			reversegraph[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
			
			graph[from].add(to);
			reversegraph[to].add(from);
		}
		
		for(int i = 1; i <= v; i++) {
			if(!visited[i]) {
				dfs(i, graph, true);
			}
		}
		
		Arrays.fill(visited, false);
		
		dfs(stack.pop(), reversegraph, false);
		
		String answer = "Yes";
		while(!stack.isEmpty()) {
			if(!visited[stack.pop()]) {
				answer = "No";
				break;
			}
		}
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, ArrayList<Integer>[] graph, boolean check) {
		visited[depth] = true;
		
		for(int a : graph[depth]) {
			if(!visited[a]) {
				dfs(a, graph, check);
			}
		}
		
		if(check) {
			stack.add(depth);
		}
	}
}
