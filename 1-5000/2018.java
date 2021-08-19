import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		for(int i = 1; i <= n; i++) {
			num[i - 1] = i;
		}
		
		int start = 0, end = 0;
		long sum = 0, answer = 0;
		while(start < n) {
			if(sum > n || end == n) {
				sum -= num[start];
				start++;
			}
			else {
				sum += num[end];
				end++;
			}
			
			if(sum == n) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
