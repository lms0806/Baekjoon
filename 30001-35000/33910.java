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
		
		long answer = 0, min = Long.MAX_VALUE;
		for(int i = n - 1; i >= 0; i--) {
			min = Math.min(min, arr[i]);
			
			answer += min;
		}
		System.out.print(answer);
	}
}
