import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], sum = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < d; i++) {
			for(int j = 0; j < n; j++) {
				if(sum[j] + arr[j] > k) {
					Arrays.fill(sum, 0);
					answer++;
					break;
				}
			}
			
			for(int j = 0; j < n; j++) {
				sum[j] += arr[j];
			}
		}
		System.out.print(answer);
	}
}
