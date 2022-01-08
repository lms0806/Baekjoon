import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] arr = new int[10000];
	static boolean[] prime;
	static int[] d = {1000, 100, 10, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		prime = new boolean[10000];
		
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < 10000; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 10000; j+=i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			sb.append(bfs()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs() {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[10000];
		
		queue.add(new int[] {n, 0});
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == m) {
				return now[1] + "";
			}
			
			for(int i = 0; i < 4; i++) {
				int val = now[0] / d[i] / 10;
				int mod = now[0] % d[i];
				
				for(int j = 0; j < 10; j++) {
					if(i == 0 && j == 0) {
						continue;
					}
					
					int next = (val * d[i] * 10) + (j * d[i]) + mod;
					if(next > 1001 && !visited[next] && !prime[next]) {
						queue.add(new int[] {next, now[1] + 1});
						visited[next] = true;
					}
				}
			}
		}
		return "Impossible";
	}
}
