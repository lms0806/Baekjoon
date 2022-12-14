import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] sum = new int[n + 1];
		long[] count = new long[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			sum[i] = (Integer.parseInt(st.nextToken()) + sum[i - 1]) % m;
			count[sum[i]]++;
		}
		
		long answer = count[0];
		for(int i = 0; i < m; i++) {
			long now = count[i];
			
			answer += now * (now - 1) / 2;
		}
		System.out.print(answer);
	}
}
