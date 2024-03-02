import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		long answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			answer += arr[i] * 2;
		}
		
		answer += n * 2 + arr[0] + arr[n - 1];
		
		for(int i = 0; i < n - 1; i++) {
			if(i < n - 1) {
				answer += Math.abs(arr[i] - arr[i + 1]);
			}
		}
		System.out.print(answer);
	}
}
