import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent, cost;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		parent = new int[1000001];
		cost = new int[1000001];
		
		for(int i = 1; i < 1000001; i++) {
			parent[i] = i;
			cost[i] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char c = st.nextToken().charAt(0);
			
			if(c == 'I') {
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				union(a, b);
			}
			else {
				int num = Integer.parseInt(st.nextToken());
				
				sb.append(cost[find(num)]).append("\n");
			}
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
		cost[pb] += cost[pa];
		cost[pa] = 0;
	}
}
