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
		
		int t = Integer.parseInt(br.readLine().trim());
		
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
				int a = st.nextToken().charAt(1) - '1', b = st.nextToken().charAt(1) - '1';

				arr[a].add(b);
				arr[b].add(a);
			}
			
			String s = st.nextToken();
			sb.append("The number of supervillains in 2-hop neighborhood of ").append(s).append(" is ").append(bfs(s.charAt(1) - '1')).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int start) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		queue.add(new int[] {start, 0});
		visited[start] = true;
		
		int count = 0;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[1] == 2) {
				continue;
			}
			
			for(int a : arr[now[0]]) {
				if(!visited[a]) {
					visited[a] = true;
					queue.add(new int[] {a, now[1] + 1});
					count++;
				}
			}
		}
		return count;
	}
}
