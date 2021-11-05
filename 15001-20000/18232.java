import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static int n, s, e;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		
		arr = new ArrayList[n + 1];
		for(int i = 0; i < n + 1; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {s, 0});
		visited[s] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int a = now[0];
			int b = now[1];
			
			if(a == e) {
				return b;
			}
			
			for(int i = 0; i < arr[a].size(); i++) {
				int aa = arr[a].get(i);
				if(!visited[aa]) {
					visited[aa] = true;
					queue.add(new int[] {aa, b + 1});
				}
			}
			
			if(a + 1 <= n && !visited[a + 1]) {
				visited[a + 1] = true;
				queue.add(new int[] {a + 1, b + 1});
			}
			
			if(a - 1 > 0 && !visited[a - 1]) {
				visited[a - 1] = true;
				queue.add(new int[] {a - 1, b + 1});
			}
		}
		return 0;
	}
}
