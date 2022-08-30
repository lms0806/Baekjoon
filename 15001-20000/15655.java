import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] arr;
	static boolean[] visited;
	static ArrayList<String> answer = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		String[] strs = new String[m];
		dfs(strs, 0, 0);
		
		StringBuilder sb = new StringBuilder();
		for(String s : answer) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(String[] strs, int depth, int which) {
		if(depth == m) {
			StringBuilder sb = new StringBuilder();
			for(String s : strs) {
				sb.append(s).append(" ");
			}
			answer.add(sb.toString());
			return;
		}
		
		for(int i = which; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				strs[depth] = String.valueOf(arr[i]);
				dfs(strs, depth + 1, i);
				visited[i] = false;
			}
		}
	}
}
