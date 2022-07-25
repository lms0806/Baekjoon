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
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			arr = new ArrayList[n];
			for(int i = 0; i < n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			while(m --> 0) {
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				arr[a].add(b);
				arr[b].add(a);
			}
			
			sb.append(bfs()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs() {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int a : arr[now]) {
				if(!visited[a]) {
					visited[a] = true;
					queue.add(a);
				}
			}
		}
		
		for(boolean b : visited) {
			if(!b) {
				return "Not connected.";
			}
		}
		return "Connected.";
	}
}
