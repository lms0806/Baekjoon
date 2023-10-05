import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			
			sb.append(find(Integer.parseInt(st.nextToken())) == find(Integer.parseInt(st.nextToken())) ? "Y" : "N").append("\n");
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
		
		if(pa == pb) {
			return;
		}
		
		parent[pa] = pb;
	}
}
