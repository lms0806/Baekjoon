import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int m;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[m + 1];
		for(int i = 1; i <= m; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[b].add(a);
		}
		
		System.out.print(bfs(p));
	}
	
	public static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[m + 1];
		visited[start] = true;
		queue.add(start);
		
		int count = 0;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			if(arr[now].size() == 0) {
				return count;
			}
			
			if(visited[arr[now].get(0)]) {
				continue;
			}
			
			queue.add(arr[now].get(0));
			visited[arr[now].get(0)] = true;
			count++;
			
		}
		
		return -1;
	}
}
