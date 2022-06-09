import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		System.out.print(bfs(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1));;
	}
	
	public static int bfs(int start, int end) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		visited[start] = true;
		queue.add(new int[] {start, 0});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == end) {
				return now[1];
			}
			
			for(int i = now[0]; i < n; i += arr[now[0]]) {
				if(!visited[i]) {
					queue.add(new int[] {i, now[1] + 1});
					visited[i] = true;
				}
			}
			
			for(int i = now[0]; i >= 0; i -= arr[now[0]]) {
				if(!visited[i]) {
					queue.add(new int[] {i, now[1] + 1});
					visited[i] = true;
				}
			}
		}
		return -1;
	}
}
