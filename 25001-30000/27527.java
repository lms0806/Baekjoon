import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(n, m, arr));
	}
	
	public static String solve(int n, int m, int[] arr) {
		int count = 9 * m / 10 + ((9 * m) % 10 == 0 ? 0 : 1);
		
		int[] num = new int[1000001];
		for(int i = 0; i < m; i++) {
			num[arr[i]]++;
			
			if(num[arr[i]] == count) {
				return "YES";
			}
		}
		
		for(int i = m; i < n; i++) {
			num[arr[i - m]]--;
			num[arr[i]]++;
			
			if(num[arr[i]] == count) {
				return "YES";
			}
		}
		
		return "NO";
	}
}
