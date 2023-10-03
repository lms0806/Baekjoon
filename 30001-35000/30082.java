import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), k =Integer.parseInt(st.nextToken());
		
		int[] list = new int[m];
		arr = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int l : list) {
			bfs(l);
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(visited[i]) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int x) {
		Queue<Integer> queue = new LinkedList<>();
		visited[x] = true;
		queue.add(x);
		
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
