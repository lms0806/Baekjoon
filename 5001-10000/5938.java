import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, count = 0;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			arr[start].add(end);
			arr[end].add(start);
		}
		
		bfs(1);
		
		StringBuilder sb = new StringBuilder();
		if(count == n) {
			sb.append(0);
		}
		else {
			for(int i = 1; i <= n; i++) {
				if(!visited[i]) {
					sb.append(i).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();

			count++;
			for(int temp : arr[now]) {
				if(!visited[temp]) {
					queue.add(temp);
					visited[temp] = true;
				}
			}
		}
	}
}
