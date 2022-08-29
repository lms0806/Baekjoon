import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[101];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(dfs(1, 0, 0));
	}
	
	public static int dfs(int num, int depth, int which) {
		if(depth == m) {
			return num;
		}
		
		int answer = 0;
		answer = Math.max(dfs(num + arr[which + 1], depth + 1, which + 1), dfs(num / 2 + arr[which + 2], depth + 1, which + 2));
		return answer;
	}
}
