import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = Long.parseLong(st.nextToken());
			
			answer += Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i = 1; i <= n; i++) {
			answer += arr[i - 1] * i;
		}
		System.out.print(answer);
	}
}
