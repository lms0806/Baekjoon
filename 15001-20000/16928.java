import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] arr = new int[101], answer = new int[101];
	static boolean[] visited = new boolean[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		
		bfs(1);
		
		System.out.print(answer[100]);
	}
	
	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		visited[x] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i = 1; i <= 6; i++) {
				int nx = now + i;
				
				if(nx < 101 && !visited[nx]) {
					if(arr[nx] != 0) {
						if(!visited[arr[nx]]) {
							queue.add(arr[nx]);
							answer[arr[nx]] = answer[now] + 1;
							visited[arr[nx]] = true;
						}
					}
					else {
						queue.add(nx);
						answer[nx] = answer[now] + 1;
					}
					visited[nx] = true;
				}
			}
		}
	}
}
