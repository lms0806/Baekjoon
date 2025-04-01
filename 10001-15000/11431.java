import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()) + 1, m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][2];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			double sum = 0;
			for(int i = 1; i < n; i++) {
				sum += arr[i - 1][0] == arr[i][0] ? Math.abs(arr[i - 1][1] - arr[i][1]) : Math.abs(arr[i - 1][0] - arr[i][0]);
			}
			sb.append("Data Set ").append(t).append(":").append("\n").append((int)Math.ceil(sum * m / k)).append("\n\n");
		}
		System.out.print(sb);
	}
}
