import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int v;
	static boolean[] visited;
	static ArrayList<List<Integer>> scc;
	static Stack<Integer> stack = new Stack<>();
	static ArrayList<Integer>[] graph, reversegraph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		v = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		visited = new boolean[v + 1];
		graph = new ArrayList[v + 1];
		reversegraph = new ArrayList[v + 1];
		scc = new ArrayList<>();
		
		for(int i = 1; i <= v; i++) {
			graph[i] = new ArrayList<>();
			reversegraph[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			StringTokenizer  st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
			
			graph[from].add(to);
			reversegraph[to].add(from);
		}
		
		for(int i = 1; i <= v; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		Arrays.fill(visited, false);
		
		int count = 0;
		scc.add(new ArrayList<>());
		while(!stack.isEmpty()) {
			int now = stack.pop();
			
			if(!visited[now]) {
				redfs(now, count);
				count++;
				scc.add(new ArrayList<>());
			}
		}
		scc.remove(scc.size() - 1);
		
		int answer = 0;
		for(List<Integer> s : scc) {
			answer = Math.max(answer, s.size());
		}
		System.out.print(answer);
	}
	
	public static void redfs(int depth, int count) {
		visited[depth] = true;
		scc.get(count).add(depth);
		
		for(int a : reversegraph[depth]) {
			if(!visited[a]) {
				redfs(a, count);
			}
		}
	}
	
	public static void dfs(int depth) {
		visited[depth] = true;
		
		for(int a : graph[depth]) {
			if(!visited[a]) {
				dfs(a);
			}
		}
		
		stack.add(depth);
	}
}
