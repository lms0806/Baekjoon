import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		visited = new boolean[n];
		
		dfs(0, 0, 31);
		
		System.out.print(sb);
	}
	
	public static void dfs(int depth, int sum, int before) {
		if(sum == n) {
			for(int i = n - 1; i >= 0; i--) {
				if(arr[i] != 0) {
					sb.append(arr[i]).append(" ");
				}
			}
			sb.append("\n");
			return;
		}
		if(depth == n) {
			return;
		}
		
		for(int i = n - 1; i >= 0; i--) {
			if(sum + i + 1 <= n && before >= i + 1) {
				arr[n - depth - 1] = i + 1;
				dfs(depth + 1, sum + i + 1, i + 1);
				arr[n - depth - 1] = 0;
			}
		}
	}
}
