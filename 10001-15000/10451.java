import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[n];
			check = new boolean[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken()) - 1;
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				if(!check[i]) {
					check[i] = true;
					dfs(i);
					answer++;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int node) {
		int next = arr[node];
		
		if(!check[next]) {
			check[next] = true;
			dfs(next);
		}
	}
}
