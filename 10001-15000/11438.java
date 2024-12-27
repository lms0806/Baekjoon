import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] depth;
	static int[][] parent;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		depth = new int[n + 1];
		arr = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int k = (int) (Math.ceil(Math.log(n) / Math.log(2)) + 1);
		parent = new int[n + 1][k];
		
		dfs(0, 1);
		
		for (int i = 1; i < k; i++) {
			for (int node = 1; node <= n; node++) {
				parent[node][i] = parent[parent[node][i - 1]][i - 1];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(lca(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), k)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int lca(int a, int b, int k) {
		if (depth[a] > depth[b]) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for (int i = k - 1; i >= 0; i--) {
			if (depth[b] - depth[a] >= Math.pow(2,i)) {
				b = parent[b][i];
			}
		}
		
		if (a == b) {
			return a;
		}
		
		for (int i = k - 1; i>= 0; i--) {
			if (parent[a][i] != parent[b][i]) {
				a = parent[a][i];
				b = parent[b][i];
			}
		}
		return parent[a][0];
	}
	
	public static void dfs(int nowDepth, int idx) {
		visited[idx] = true;
		depth[idx] = nowDepth;
		
		for(int child : arr[idx]) {
			if(!visited[child]) {
				parent[child][0] = idx;
				dfs(nowDepth + 1, child);
			}
		}
	}
}
