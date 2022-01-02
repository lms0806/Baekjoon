import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] d = {2, 3, 1, -1};
	static int n, m;
	static int[] arr;;
	static boolean[] visited, prime = new boolean[1000001];
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			arr = new int[1000001];
			visited = new boolean[1000001];
			
			sb.append(bfs(start, end)).append("\n");
		}
		System.out.print(sb);
	}
 	
 	public static int bfs(int start, int end) {
 		Queue<int[]> queue = new LinkedList<>();
 		queue.add(new int[] {n, 0});
 		visited[n] = true;
 		
 		while(!queue.isEmpty()) {
 			int[] now = queue.poll();
 			
 			if(start <= now[0] && now[0] <= end && !prime[now[0]]) {
 				return now[1];
 			}
 			
 			for(int i = 0; i < 2; i++) {
 				int nx = now[0] / d[i];
 				
 				if(nx >= 0 && nx < 1000000 && !visited[nx]) {
 					queue.add(new int[] {nx, now[1] + 1});
 					visited[nx] = true;
 				}
 			}
 			
 			for(int i = 2; i < 4; i++) {
 				int nx = now[0] + d[i];
 				
 				if(nx >= 0 && nx < 1000000 && !visited[nx]) {
 					queue.add(new int[] {nx, now[1] + 1});
 					visited[nx] = true;
 				}
 			}
 		}
 		
 		return -1;
 	}
}
