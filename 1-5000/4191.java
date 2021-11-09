import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			visited = new boolean[n + 1];
			arr = new ArrayList[n + 1];
			for(int i = 1; i <= n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				arr[a].add(b);
			}
			
			for(int i = 0; i < l; i++) {
				bfs(Integer.parseInt(br.readLine()));
			}
			
			int answer = 0;
			for(int i = 1; i <= n; i++) {
				if(visited[i]) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int temp : arr[now]) {
				if(!visited[temp]) {
					queue.add(temp);
					visited[temp] = true;
				}
			}
		}
	}
}
