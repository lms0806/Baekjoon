import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static ArrayList<int[]>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			int val = Integer.parseInt(st.nextToken());
			
			arr[a].add(new int[] {b, c == 'b' ? val : -val});
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		long[] dist = new long[n + 1];
		int[] cycle = new int[n + 1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		queue.add(1);
		dist[1] = 0;
		cycle[1]++;
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			visited[now] = false;
			
			for(int i = 0; i < arr[now].size(); i++) {
				int next = arr[now].get(i)[0];
				int cost = arr[now].get(i)[1];
				
				if(dist[next] > dist[now] + cost) {
					dist[next] = dist[now] + cost;
					
					if(!visited[next]) {
						cycle[next]++;
						
						if(cycle[next] >= n) {
							return "-1";
						}
						queue.add(next);
						visited[next] = true;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(dist[i] < 0) {
				sb.append(i).append("\n");
			}
		}
		return sb.toString();
	}
}
