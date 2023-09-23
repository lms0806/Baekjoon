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
			int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			long[] arr = new long[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int solve = 0;
			long sum = 0, total = 0;
			for(int i = 0; i < n; i++) {
				if(sum + arr[i] <= l) {
					sum += arr[i];
					solve++;
					total += sum;
				}
			}
			sb.append("Case ").append(t).append(": ").append(solve).append(" ").append(sum).append(" ").append(total).append("\n");
		}
		System.out.print(sb);
	}
}
