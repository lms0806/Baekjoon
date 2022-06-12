import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n];
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i = 0; i < n; i++) {
			visited[i] = true;
			dfs(i, 0);
		}
		System.out.print(answer);
	}
	
	public static void dfs(int x, int depth) {
		if(depth == 4) {
			answer = 1;
			return;
		}
		
		for(int a : arr[x]) {
			if(!visited[a]) {
				visited[a] = true;
				dfs(a, depth + 1);
			}
		}
		
		visited[x] = false;
	}
}
