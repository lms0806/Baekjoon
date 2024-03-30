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
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			long sum = 0;
			long[] arr = new long[3];
			for(int i = 0; i < 3; i++) {
				sum += arr[i] = Long.parseLong(st.nextToken());
			}
			
			sum -= Long.parseLong(st.nextToken());
			
			Arrays.sort(arr);
			
			long a = Math.min(sum / 3, arr[0]);
			sum -= a;
			
			long b = Math.min(sum / 2, arr[1]);
			
			sb.append(a * b * (sum - b)).append("\n");
		}
		System.out.print(sb);
	}
}
