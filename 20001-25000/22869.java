import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		check = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		
		System.out.print(check[n - 1] ? "YES" : "NO");
	}
	
	public static void dfs(int depth) {
		if(depth == n) {
			return;
		}
		
		if(check[depth]) {
			return;
		}
		
		check[depth] = true;
		for(int i = depth + 1; i < n; i++) {
			if((i - depth) * (1 + Math.abs(arr[depth] - arr[i])) <= k) {
				dfs(i);
			}
		}
	}
}
