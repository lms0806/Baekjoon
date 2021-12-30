import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, count;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			arr = new ArrayList[n + 1];
			visited = new boolean[n + 1];
			
			for(int i = 1; i <= n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			for(int i = 0; i < m; i++){
				st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				arr[a].add(b);
			}
			
			int answer = 0;
			for(int i = 1; i <= n; i++) {
				if(!arr[i].isEmpty()) {
					visited = new boolean[n + 1];
					count = 0;
					dfs(i);
					answer += count - 1;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int depth) {
		visited[depth] = true;
		
		count++;
		
		for(int a : arr[depth]) {
			if(!visited[a]) {
				dfs(a);
			}
		}
	}
}
