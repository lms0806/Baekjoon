import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);

		long sum = 0;
		int answer = n;
		for(int i = 0; i < a; i++) {
			sum += (arr[i] >> 1);
			
			if(sum > b) {
				answer = i;
				break;
			}
		}
		
		if(sum <= b) {
			for(int i = a; i < n; i++) {
				sum += (arr[i] >> 1) + (arr[i - a] >> 1);
				
				if(sum > b) {
					answer = i;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
