import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		long[] count = new long[n];
		
		long answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				count[i] = (long) Math.max(Math.ceil(Math.log((double)arr[i - 1] / (double)arr[i]) / Math.log(2)) + count[i - 1], 0);
				answer += count[i];
			}
		}

		System.out.print(answer);
	}
}
