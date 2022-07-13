import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] arr, answer;
	static boolean[] visited;
	static LinkedHashSet<String> set = new LinkedHashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		answer = new int[m];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0);
		
		set.forEach(System.out::println);
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			StringBuilder sb = new StringBuilder();
			for(int a : answer) {
				sb.append(a).append(" ");
			}
			set.add(sb.toString());
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				answer[depth] = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
