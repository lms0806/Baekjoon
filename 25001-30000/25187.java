import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static int[][] cost;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		cost = new int[n + 1][2];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
			cost[i][Integer.parseInt(st.nextToken())]++;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			union(a, b);
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			int pn = find(Integer.parseInt(br.readLine()));
			sb.append(cost[pn][0] < cost[pn][1] ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int find(int n) {
		if(parent[n] == n) {
			return n;
		}
		return parent[n] = find(parent[n]);
	}
	
	public static void union(int a, int b) {
		int pa = find(a);
		int pb = find(b);
		
		if(pa == pb) {
			return;
		}
		
		parent[pa] = pb;
		cost[pb][0] += cost[pa][0];
		cost[pb][1] += cost[pa][1];
	}
}
