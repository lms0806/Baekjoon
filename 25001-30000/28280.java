import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int MAX = 4000001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(bfs(Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[MAX];
		queue.add(new int[] {1, 0});
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n) {
				return now[1];
			}
			
			if(now[0] * 2 < MAX && !visited[now[0] * 2]) {
				visited[now[0] * 2] = true;
				queue.add(new int[] {now[0] * 2, now[1] + 1});
			} 
			if(now[0] - 1 > 0 && !visited[now[0] - 1]) {
				visited[now[0] - 1] = true;
				queue.add(new int[] {now[0] - 1, now[1] + 1});
			}
		}
		return Integer.MAX_VALUE;
	}
}
