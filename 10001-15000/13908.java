import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m, answer = 0;
	static int[] arr, num = new int[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		if(m != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int idx) {
		if(idx == n) {
			for(int i : arr) {
				if(num[i] == 0) {
					return;
				}
			}
			answer++;
			return;
		}
		
		for(int i = 0; i <= 9; i++) {
			num[i]++;
			dfs(idx + 1);
			num[i]--;
		}
	}
}
