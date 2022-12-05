import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] arr;
	static HashSet<Long> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		
		long sum = 0;
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		dfs(0, 0);
		
		System.out.print(sum - set.size() + 1);
	}
	
	public static void dfs(int depth, long sum) {
		set.add(sum);
		
		if(depth == n) {
			return;
		}
		
		dfs(depth + 1, sum + arr[depth]);
		dfs(depth + 1, sum);
	}
}
