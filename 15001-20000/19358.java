import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			long answer = 0, idx = 0;
			for(int i = n - 1; i >= 0; i--) {
				if(arr[i] - idx <= 0) {
					break;
				}
				
				answer += arr[i] - idx;
				idx++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
