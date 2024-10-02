import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] num = new int[n * 2 + 1];
		
		for(int i = 1; i <= n * 2; i++) {
			num[i] = num[i - 1] + arr[(i - 1) % n];
		}
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < i + n; j++) {
				int sum = num[j + 1] - num[i];
				
				if(sum < 0) {
					answer += Math.ceil((double)(Math.abs(sum) / (double)num[n])); 
				}
			}
		}
		System.out.print(answer);
	}
}
