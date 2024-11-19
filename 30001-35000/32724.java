import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		Arrays.sort(arr);
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			long num = 0;
			for(int j = i + 1; j < n; j++) {
				long number = arr[j] - arr[j - 1];
				
				answer += num + number;
				
				num += number;
			}
		}
		System.out.print(answer);
	}
}
