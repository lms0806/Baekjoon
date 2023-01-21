import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int v;
	static boolean[] visited;
	static ArrayList<List<Integer>> scc;
	static Stack<Integer> stack = new Stack<>();
	static ArrayList<Integer>[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		visited = new boolean[v + 1];
		graph = new ArrayList[v + 1];
		scc = new ArrayList<>();
		
		for(int i = 0; i < v; i++) {
			graph[i] = new ArrayList<>();
		}
		
		while(e --> 0) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
			
			graph[from].add(to);
		}
		
		for(int i = 0; i < v; i++) {
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
		
		System.out.print(scc.size());
	}
	
	public static void redfs(int depth, int count) {
		visited[depth] = true;
		scc.get(count).add(depth);
		
		for(int a : graph[depth]) {
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
