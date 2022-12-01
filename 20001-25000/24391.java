import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			Union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int prev = 0, num = 0, answer = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			if(i > 0) {
				prev = num;
				num = Integer.parseInt(st.nextToken());
				if(Find(prev) != Find(num)) {
					answer++;
				}
			}
			else {
				num = Integer.parseInt(st.nextToken());
			}
		}
		System.out.print(answer);
	}
	
	public static int Find(int n) {
		if(parent[n] == n) {
			return n;
		}
		return parent[n] = Find(parent[n]);
	}
	
	public static void Union(int a, int b) {
		int pa = Find(a);
		int pb = Find(b);
		
		parent[pa] = pb;
	}
}
