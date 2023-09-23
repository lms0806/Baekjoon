import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int n;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] a = br.readLine().split(":"), b = br.readLine().split(":");
		
		int s = Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
		int e = Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1]);
		
		if(s > e) {
			e += 60 * 24;
		}
		
		n = e - s;
		
		visited = new boolean[n + 1];
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		visited[0] = true;
		
		int[] dx = {1, 60};
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n) {
				return now[1];
			}
			
			for(int i = 0; i < 2; i++) {
				int nx = now[0] + dx[i];
				
				if(nx <= n && !visited[nx]) {
					queue.add(new int[] {nx, now[1] + 1});
					visited[nx] = true;
				}
			}
		}
		
		return -1;
	}
}
