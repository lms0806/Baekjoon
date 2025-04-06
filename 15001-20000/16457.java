import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k;
	static int answer = 0;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		visited = new boolean[(n << 1) + 1];
		arr = new ArrayList[m];
		for(int i = 0; i < m; i++) {
			arr[i] = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < k; j++) {
				arr[i].add(Integer.parseInt(st.nextToken()));
			}
		}
		
		dfs(0, 1);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int num) {
		if(depth == n) {
			int count = 0;
			for(int i = 0; i < m; i++) {
				boolean check = true;
				
				for(int j = 0; j < k; j++) {
					if(!visited[arr[i].get(j)]) {
						check = false;
						break;
					}
				}
				
				if(check) {
					count++;
				}
			}
			answer = Math.max(answer, count);
			return;
		}
		
		for(int i = num; i <= n << 1; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, i + 1);
				visited[i] = false;
			}
		}
		
	}
}
