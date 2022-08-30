import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, count = 1;
	static ArrayList<Integer>[] arr;
	static int[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		visited = new int[n];
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i = 0; i < arr.length; i++) {
			Collections.sort(arr[i]);
		}
		
		bfs(r - 1);
		
		StringBuilder sb = new StringBuilder();
		for(int v : visited) {
			sb.append(v).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = count;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int a : arr[now]) {
				if(visited[a] == 0) {
					count++;
					visited[a] = count;
					queue.add(a);
				}
			}
		}
	}
}
