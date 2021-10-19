import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] num, arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		num = new int[m];
		arr = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		solve(0);
		
		System.out.print(sb);
	}
	
	public static void solve(int k) {
		if(k == m) {
			for(int a : num) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}
		else {
			for(int i = 0; i < n; i++) {
				if(visited[i]) {
					continue;
				}
				visited[i] = true;
				num[k] = arr[i];
				solve(k + 1);
				visited[i] = false;
			}
		}
	}
}
