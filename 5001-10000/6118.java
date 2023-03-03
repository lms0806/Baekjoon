import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] arr, list;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		list = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
			list[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		bfs(1);
		
		StringBuilder sb = new StringBuilder();
		for(int i = n; i > 0; i--) {
			if(list[i].size() != 0) {
				Collections.sort(list[i]);
				
				sb.append(list[i].get(0)).append(" ").append(i).append(" ").append(list[i].size());
				break;
			}
		}
		System.out.print(sb);
		
	}
	
	public static void bfs(int start) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		
		queue.add(new int[] {start, 0});
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int a : arr[now[0]]) {
				if(!visited[a]) {
					visited[a] = true;
					list[now[1] + 1].add(a);
					queue.add(new int[] {a, now[1] + 1});
				}
			}
		}
	}
}
