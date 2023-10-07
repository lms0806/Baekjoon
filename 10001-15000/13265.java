import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] color;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			color = new int[n + 1];
			arr = new ArrayList[n + 1];
			for(int i = 1; i <= n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				arr[a].add(b);
				arr[b].add(a);
			}
			
			boolean flag = true;
			for(int i = 1; i <= n; i++) {
				if(color[i] == 0) {					
					if(!(flag = bfs(i))) {
						break;
					}
				}
			}
			
			sb.append(flag ? "possible" : "impossible").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean bfs(int s) {
		Queue<Integer> queue = new LinkedList<>();
		color[s] = 1;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int a : arr[now]) {				
				if(color[a] == 0) {
					color[a] = -color[now];
					queue.add(a);
				}
				else {
					if(color[a] == color[now]) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
