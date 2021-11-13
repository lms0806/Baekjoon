import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1};
	static int n, m;
	static boolean[] visited = new boolean[100001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		System.out.print(bfs());
	}

	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {n, 0});
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == m) {
				return now[1];
			}
			
			if(now[0] * 2 < 100001 && !visited[now[0] * 2]) {
				queue.add(new int[] {now[0] * 2, now[1]});
				visited[now[0] * 2] = true;
			}
			for(int i = 0; i < 2; i++) {
				int nx = now[0] + dx[i];
				
				if(nx >= 0 && nx < 100001 && !visited[nx]) {
					queue.add(new int[] {nx, now[1] + 1});
					visited[nx] = true;
				}
			}
		}
		return -1;
	}
}
