import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int n = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] != 0) {
				continue;
			}
			
			for(int j = i; j <= n; j += i) {
				arr[j] = Math.max(arr[j], i);
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(arr[i] <= k) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
