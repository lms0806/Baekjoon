import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		parent = new int[n];
		
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		
		int answer = 0;
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);
	}
	
	public static int find(int n) {
		if(n == parent[n]) {
			return n;
		}
		return parent[n] = find(parent[n]);
	}
	
	public static boolean union(int a, int b) {
		int pa = find(a);
		int pb = find(b);
		
		if(pa == pb) {
			return true;
		}
		
		parent[pa] = pb;
		return false;
	}
}
