import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent, cost;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		cost = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(cost[i] != Integer.MAX_VALUE) {
				sum += cost[i];
			}
		}
		
		System.out.print(sum <= k ? sum : "Oh no");
	}
	
	public static int find(int n) {
		if(parent[n] == n) {
			return n;
		}
		return parent[n] = find(parent[n]);
	}
	
	public static void union(int x, int y) {
		int pa = find(x);
		int pb = find(y);
		
		if(pa == pb) {
			return;
		}
		
		parent[pa] = pb;
		cost[pb] = Math.min(cost[pb], cost[pa]);
		cost[pa] = Integer.MAX_VALUE;
	}
}
