import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 2};
	static int[] arr = new int[100001];
	static int n;
	static ArrayList<Integer> path = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(bfs(Integer.parseInt(st.nextToken()))).append("\n");
		for(int i = path.size() - 1; i >= 0; i--) {
			sb.append(path.get(i)).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int k) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[100001];
		int[] parent = new int[100001];
		queue.add(new int[] {n, 0});
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == k) {
				int idx = now[0];
				while(idx != n) {
					path.add(idx);
					idx = parent[idx];
				}
				path.add(n);
				return now[1];
			}
			
			for(int i = 0; i < 3; i++) {
				int nx = i < 2 ? now[0] + dx[i] : now[0] * dx[i];
				
				if(nx >= 0 && nx < 100001 && !visited[nx]) {
					queue.add(new int[] {nx, now[1] + 1});
					parent[nx] = now[0];
					visited[nx] = true;
				}
			}
		}
		
		return -1;
	}
}
