import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		long[] sum = new long[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			sum[i] = arr[i] = Integer.parseInt(st.nextToken());
			sum[i] += sum[i - 1];
		}
		
		int answer = -1;
		for(int i = 1; i <= n; i++) {
			if(sum[n] - sum[i - 1] >= m) {
				answer = i;
			}
		}
		
		System.out.print(answer);
	}
}
