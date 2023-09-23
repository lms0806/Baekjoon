import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			int answer = 0, sum = 0;
			for(int i = n - 1; i >= 0; i--) {
				sum += arr[i];
				
				answer++;
				
				if(sum >= k) {
					break;
				}
			}
			sb.append("Scenario #").append(t).append(":").append("\n").append(sum < k ? "impossible" : answer).append("\n\n");
		}
		System.out.print(sb);
	}
}
