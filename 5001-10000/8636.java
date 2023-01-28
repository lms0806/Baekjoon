import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int k = 0;
	static int[] arr, check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		check = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine()) - 1;
		}
		
		for(int i = 0; i < n; i++) {
			if(check[i] == 0) {
				k++;
				dfs(i);
			}
		}
		
		System.out.print(k);
	}
	
	public static void dfs(int node) {
		check[node] = k;
		int next = arr[node];
		
		if(check[next] == 0) {
			dfs(next);
		}
	}
}
