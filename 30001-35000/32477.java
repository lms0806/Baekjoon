import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0, n;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				bfs(i);
			}
		}
		
		System.out.print(answer);
	}
	
	public static void bfs(int s) {
		Queue<Integer> queue = new LinkedList<>();
		visited[s] = true;
		queue.add(s);
		
		int count = 1;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int next : arr[now]) {
				if(!visited[next]) {
					visited[next] = true;
					queue.add(next);
					count++;
				}
			}
		}
		
		answer = Math.max(answer, count);
	}
}
