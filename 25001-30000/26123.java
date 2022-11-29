import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		max -= d;
		
		long answer = 0;
		for(int a : arr) {
			if(max < 0) {
				answer += a;
			}
			else if(max < a) {
				answer += a - max;
			}
		}
		System.out.print(answer);
	}
}
