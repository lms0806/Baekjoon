import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] num;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		num = new int[n + 1][n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
			Arrays.fill(num[i], -1);
			num[i][i] = 0;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			arr[e].add(s);
		}
		
		for(int i = 1; i <= n; i++) {
			bfs(i);
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int answer = Integer.MAX_VALUE;
			for(int i = 1; i <= n; i++) {
				if(num[a][i] != -1 && num[b][i] != -1) {
					answer = Math.min(answer, Math.max(num[a][i], num[b][i]));
				}
			}
			sb.append(answer == Integer.MAX_VALUE ? -1 : answer).append("\n");
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

			for(int next : arr[now[0]]) {
				if(!visited[next]) {
					visited[next] = true;
					num[start][next] = now[1] + 1;
					queue.add(new int[] {next, now[1] + 1});
				}
			}
		}
	}
}
