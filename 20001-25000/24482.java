import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n;
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
		
		Arrays.fill(visited, -1);
		for(int i = 0; i < arr.length; i++) {
			Collections.sort(arr[i]);
			Collections.reverse(arr[i]);
		}
		
		dfs(r - 1, 0);
		
		StringBuilder sb = new StringBuilder();
		for(int v : visited) {
			sb.append(v).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int start, int depth) {
		visited[start] = depth;
		for(int a : arr[start]) {
			if(visited[a] == -1) {
				dfs(a, depth + 1);
			}
		}
	}
}
