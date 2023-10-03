import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int[] cost = new int[n - 1];
		
		for(int i = 0; i < n - 1; i++) {
			cost[i] = arr[i + 1] - arr[i];
		}
		
		Arrays.sort(cost);
		
		int answer = 0;
		for(int i = 0; i < n - k; i++) {
			answer += cost[i];
		}
		System.out.print(answer);
	}
}
