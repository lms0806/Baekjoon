import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		parent = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i <= n; i++) {
			set.add(find(i));
		}
		
		System.out.print(set.size() - 1);
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
