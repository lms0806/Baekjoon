import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent, cost;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		cost = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		for(int i = 1; i <= n; i++) {
			cost[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			sb.append(Union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int Find(int n) {
		if(parent[n] == n) {
			return n;
		}
		return parent[n] = Find(parent[n]);
	}
	
	public static int Union(int a, int b) {
		int pa = Find(a);
		int pb = Find(b);
		
		if(pa == pb) {
			return cost[pb];
		}
		
		parent[pa] = pb;
		cost[pb] += cost[pa];
		return cost[pb];
	}
}
