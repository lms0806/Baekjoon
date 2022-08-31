import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long[] sum = new long[n];
		sum[0] = arr[0];
		
		for(int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		
		long answer = 0;
		for(int i = 0; i < n - 1; i++) {
			answer += arr[i] * (sum[n - 1] - sum[i]);
		}
		
		System.out.println(answer);
	}
}
