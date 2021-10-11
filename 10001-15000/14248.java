import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, size;
	static boolean visited[];
	static int num[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n];
		num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		size = Integer.parseInt(br.readLine());
		
		dfs(size - 1);
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		for(int i = -1; i < 2; i+=2) {
			int a = node + i * num[node];
			if(0 <= a && a < n && !visited[a]) {
				visited[a] = true;
				dfs(a);
			}
		}
	}
}
