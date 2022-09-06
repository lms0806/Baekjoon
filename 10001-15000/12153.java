import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append("Case #").append(i).append(": ").append(bfs(n)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[1000001];
		queue.add(new int[] {1, 1});
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n) {
				return now[1];
			}
			
			int nx = now[0] + 1;
			if(check(nx) && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
			
			StringBuilder sb = new StringBuilder();
			nx = Integer.parseInt(sb.append(now[0]).reverse().toString());
			if(check(nx) && !visited[nx]) {
				queue.add(new int[] {nx, now[1] + 1});
				visited[nx] = true;
			}
		}
		return -1;
	}
	
	public static boolean check(int x) {
		return x >= 0 && x < 1000001 ? true : false;
	}
}
