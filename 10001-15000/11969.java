import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][3], sum = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sum[i][num - 1] = arr[i][num - 1] = 1;
			
			if(i > 0) {
				for(int j = 0; j < 3; j++) {
					sum[i][j] += sum[i - 1][j];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			for(int i = 0; i < 3; i++) {
				sb.append(sum[b][i] - sum[a][i] + arr[a][i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
