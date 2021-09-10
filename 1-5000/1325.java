import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static boolean[] visited;
	static int[] result;
	static List<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[Integer.parseInt(st.nextToken()) - 1].add(Integer.parseInt(st.nextToken()) - 1);
		}
		
		result = new int[n];
		for(int i = 0; i < n; i++) {
			visited = new boolean[n];
			dfs(i);
		}
		
		int max = 0;
		for(int num : result) {
			max = Math.max(max, num);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(result[i] == max) {
				sb.append(i + 1).append(" ");
			}
		}
		System.out.print(sb);
	}
	
	public static void dfs(int n) {
		if(visited[n]) {
			return;
		}
		
		visited[n] = true;
		
		for(int num : arr[n]) {
			if(!visited[num]) {
				result[num]++;
				dfs(num);
			}
		}
	}
}
