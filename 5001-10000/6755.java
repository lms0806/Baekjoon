import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		
		System.out.print(bfs(p, q) ? "yes" : bfs(q, p) ? "no" : "unknown");
	}
	
	public static boolean bfs(int p, int q) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		queue.add(p);
		visited[p] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			if(now == q) {
				return true;
			}
			
			for(int a : arr[now]) {
				if(!visited[a]) {
					queue.add(a);
					visited[a] = true;
				}
			}
		}
		return false;
	}
}
