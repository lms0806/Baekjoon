import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] arr = new ArrayList[n + 1], arr2 = new ArrayList[n + 1];
		boolean[] visited = new boolean[n + 1], visited2 = new boolean[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
			arr2[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr2[b].add(a);
		}
		
		bfs(1, arr, visited);
		bfs(n, arr2, visited2);
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(visited[num] && visited2[num] ? "Defend" : "Destroyed").append(" the CTP").append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int s, ArrayList<Integer>[] arr, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int a : arr[now]) {
				if(!visited[a]) {
					visited[a] = true;
					queue.add(a);
				}
			}
		}
	}
}
