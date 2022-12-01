import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int[] parent, cost;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			parent = new int[n * 2];
			cost = new int[n * 2];
			
			for(int i = 0; i < n * 2; i++) {
				parent[i] = i;
				cost[i] = 1;
			}
			
			int idx = 0;
			HashMap<String, Integer> map = new HashMap<>();
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String a = st.nextToken(), b = st.nextToken();
				
				if(!map.containsKey(a)) {
					map.put(a, idx++);
				}
				if(!map.containsKey(b)) {
					map.put(b, idx++);
				}
				
				sb.append(union(map.get(a), map.get(b))).append("\n");
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
	
	public static int union(int a, int b) {
		int pa = find(a);
		int pb = find(b);
		
		if(pa == pb) {
			return cost[pa];
		}
		
		parent[pa] = pb;
		cost[pb] += cost[pa];
		cost[pa] = 1;
		
		return cost[pb];
	}
}
