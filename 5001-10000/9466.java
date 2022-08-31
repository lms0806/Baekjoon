import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, count;
	static int[] arr;
	static boolean[] visited, done;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			arr = new int[n + 1];
			visited = new boolean[n + 1];
			done = new boolean[n + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			count = 0;
			for(int i = 1; i <= n; i++) {
				if(!visited[i]) {
					dfs(i);
				}
			}
			
			sb.append(n - count).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int which) {
		visited[which] = true;
		int next = arr[which];
		
		if(!visited[next]) {
			dfs(next);
		}
		else {
			if(!done[next]) {
				for(int i = next; i != which; i = arr[i]) {
					count++;
				}
				count++;
			}
		}
		done[which] = true;
	}
}
