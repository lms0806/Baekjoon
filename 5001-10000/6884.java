import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] prime = new boolean[100000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n], sum = new int[n];
			for(int i = 0; i < n; i++) {
				sum[i] = arr[i] = Integer.parseInt(st.nextToken());
				
				if(i > 0) {
					sum[i] += sum[i - 1];
				}
			}
			
			sb.append(solve(arr, sum)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] arr, int[] sum) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				if(!prime[sum[j + i] - sum[j] + arr[j]]) {
					StringBuilder answer = new StringBuilder();
					answer.append("Shortest primed subsequence is length ").append(i + 1).append(": ");
					for(int k = j; k <= j + i; k++) {
						answer.append(arr[k]).append(" ");
					}
					return answer.toString();
				}
			}
		}
		return "This sequence is anti-primed.";
	}
}
