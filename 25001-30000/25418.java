import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int bfs(int a, int k) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[1000001];
		queue.add(new int[] {a, 0});
		visited[a] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == k) {
				return now[1];
			}
			
			int nx = now[0] + 1;
			if(check(nx) && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
			
			nx = now[0] * 2;
			if(check(nx) && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
		}
		return -1;
	}
	
	public static boolean check(int next) {
		if(next >= 0 && next < 1000001) {
			return true;
		}
		return false;
	}
}
