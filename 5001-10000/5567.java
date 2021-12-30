import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		dfs(1, 0);
		
		int answer = 0;
		for(int i = 2; i <= n; i++) {
			if(visited[i]) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int count) {
		if(count == 3) {
			return;
		}
		
		visited[depth] = true;
		
		for(int a : arr[depth]) {
			dfs(a, count + 1);
		}
	}
}
