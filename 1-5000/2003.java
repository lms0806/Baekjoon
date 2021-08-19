import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0, end = 0;
		long sum = 0, answer = 0;
		while(start < n) {
			if(sum > m || end == n) {
				sum -= num[start];
				start++;
			}
			else {
				sum += num[end];
				end++;
			}
			
			if(sum == m) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
