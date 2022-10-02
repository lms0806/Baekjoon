import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			sb.append("Scenario ").append(i).append(":").append("\n");
			
			int n = Integer.parseInt(br.readLine());
			
			parent = new int[n];
			for(int j = 0; j < n; j++) {
				parent[j] = j;
			}
			
			int k = Integer.parseInt(br.readLine());
			while(k --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				union(a, b);
			}
			
			int m = Integer.parseInt(br.readLine());
			
			while(m --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				if(find(a) == find(b)) {
					sb.append(1);
				}
				else {
					sb.append(0);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
	
	public static int find(int n) {
		if(n == parent[n]) {
			return n;
		}
		return parent[n] = find(parent[n]);
	}
	
	public static void union(int a, int b) {
		int pa = find(a);
		int pb = find(b);
		
		if(pa > pb) {
			parent[pa] = pb;
		}
		else {
			parent[pb] = pa;
		}
	}
}
