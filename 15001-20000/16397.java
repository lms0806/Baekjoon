import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int t, g;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		g = Integer.parseInt(st.nextToken());
		
		System.out.print(bfs(n));
	}
	
	public static String bfs(int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[100000];
		queue.add(new int[] {n, 0});
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[1] > t) {
				continue;
			}
			
			if(now[0] == g) {
				return now[1] + "";
			}
			
			int nx = now[0] + 1;
			if(nx > 99999) {
				continue;
			}
			if(nx >= 0 && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
			
			
			nx = now[0] * 2;
			if(nx > 99999) {
				continue;
			}
			char[] c = String.valueOf(nx).toCharArray();
			c[0] -= 1;
			
			nx = 0;
			for(int i = 0; i < c.length; i++) {
				nx += c[i] - '0';
				nx *= 10;
			}
			nx /= 10;
			
			if(nx >= 0 && nx < 100000 && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
		}
		return "ANG";
	}
}
