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
	static boolean[][] cango;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		cango = new boolean[n + 1][n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			
			arr[a].add(new int[] {b, val});
			cango[a][b] = true;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(cango[i][k] && cango[k][j]) {
						cango[i][j] = true;
					}
				}
			}
		}
		
		System.out.print(bfs());
	}
	
	public static String bfs() {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		int[] dist = new int[n + 1];
		int[] cycle = new int[n + 1];
		int[] road = new int[n + 1];
		
		Arrays.fill(dist, Integer.MIN_VALUE);
		
		queue.add(1);
		dist[1] = 0;
		cycle[1]++;
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			visited[now] = false;
			
			if(!cango[now][n]) {
				continue;
			}
			
			for(int i = 0; i < arr[now].size(); i++) {
				int next = arr[now].get(i)[0];
				int cost = arr[now].get(i)[1];
				
				if(dist[next] < dist[now] + cost) {
					dist[next] = dist[now] + cost;
					road[next] = now;
					
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
		
		int end = n;
		ArrayList<Integer> arr = new ArrayList<>();
		while(end != 0) {
			arr.add(end);
			
			end = road[end];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = arr.size() - 1; i >= 0; i--) {
			sb.append(arr.get(i)).append(" ");
		}
		return sb.toString().trim();
	}
}
