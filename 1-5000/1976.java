import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					union(i, j);
				}
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = -1;
		String answer = "YES";
		while(m --> 0) {
			int number = find(Integer.parseInt(st.nextToken()));
			
			if(num == -1) {
				num = number;
			}
			else if(num != number){
				answer = "NO";
				break;
			}
		}
		System.out.print(answer);
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
	}
}
