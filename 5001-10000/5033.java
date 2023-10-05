import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr, parent;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		parent = new int[n];
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			parent[i] = i;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[find(i)] != 0) {
				return "IMPOSSIBLE";
			}
		}
		return "POSSIBLE";
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
		arr[pb] += arr[pa];
	}
}
