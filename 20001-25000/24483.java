import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n, count = 1;
	static ArrayList<Integer>[] arr;
	static long[][] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new long[2][n];
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		Arrays.fill(visited[0], -1);
		for(int i = 0; i < arr.length; i++) {
			Collections.sort(arr[i]);
		}
		
		dfs(r - 1, 0);
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			answer += visited[0][i] * visited[1][i];
		}
		System.out.print(answer);
	}
	
	public static void dfs(int start, int depth) {
		visited[0][start] = depth;
		visited[1][start] = count++;

		for(int a : arr[start]) {
			if(visited[0][a] == -1) {
				dfs(a, depth + 1);
			}
		}
	}
}
