import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static int[] result;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		result = new int[n];
		visited = new boolean[n];
		
		dfs(0);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < result.length; i++) {
			sb.append(result[i] + 1).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int index) {
		if(visited[index]) {
			return;
		}
		
		visited[index] = true;
		
		for(int i : arr[index]) {
			if(!visited[i]) {
				result[i] = index;
				dfs(i);
			}
		}
	}
}
