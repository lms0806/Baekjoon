import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		parent = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		for(int i = 0; i < n - 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			
			union(u, v);
		}
		
		int a = find(1), b = 0;
		for(int i = 2; i <= n; i++) {
			if(find(i) != a) {
				b = find(i);
				break;
			}
		}
		
		System.out.print(a + " " + b);
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
