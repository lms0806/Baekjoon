import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, s, e;
	static long answer = 0;
	static boolean[] visited;
	static boolean flag = false;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(i == k - 1) {
				s = a;
				e = b;
				visited[b] = true;
			}
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		dfs(s);
		
		System.out.print(flag ? 0 : (n - answer) * answer);
	}
	
	public static void dfs(int now) {
		if(flag) {
			return;
		}
		
		visited[now] = true;
		answer++;
		
		for(int next : arr[now]) {
			if(now != s && next == e) {
				flag = true;
				return;
			}
			
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
}
