import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		parent = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = n;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			while(find(a) != find(b)) {
				answer--;
				
				int next = find(a) + 1;
				union(a, b);
				a = next;
			}
		}
		System.out.println(answer);
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
	}
}
