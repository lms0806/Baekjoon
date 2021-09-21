import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num[i]);
		}
		
		int[] result = new int[n];
		for(int i = m - 1; i >= 0; i--) {
			int max = 0;
			for(int j = 0; j < n; j++) {
				max = Math.max(max, num[j][i]);
			}
			
			for(int j = 0; j < n; j++) {
				if(max == num[j][i]) {
					result[j]++;
				}
			}
		}
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, result[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(max == result[i]) {
				sb.append(i + 1).append(" ");
			}
		}
		System.out.print(sb);
	}
}
