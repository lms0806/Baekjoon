import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		long[][] arr = new long[n][2], arr2 = new long[m][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Long.parseLong(st.nextToken());
			arr[i][1] = Long.parseLong(st.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			arr2[i][0] = Long.parseLong(st.nextToken());
			arr2[i][1] = Long.parseLong(st.nextToken());
		}
		
		long answer = Long.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				answer = (long) Math.max(answer, Math.pow(arr[i][0] - arr2[j][0], 2) + Math.pow(arr[i][1] - arr2[j][1], 2));
			}
		}
		System.out.print(answer);
	}
}
