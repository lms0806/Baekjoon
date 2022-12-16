import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), start = Integer.parseInt(st.nextToken());
		
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
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(arr[i]);
		}
		
		System.out.print(bfs(start));
	}
	
	public static long bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		long[] dist = new long[n + 1], t = new long[n + 1];
		
		Arrays.fill(dist, -1);
		
		int idx = 1;
		dist[start] = 0;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			t[now] = idx++;
			
			for(int a : arr[now]) {
				if(a > 0 && a <= n && dist[a] == -1) {
					dist[a] = dist[now] + 1;
					queue.add(a);
				}
			}
		}
		
		long answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += dist[i] * t[i];
		}
		return answer;
	}
}
