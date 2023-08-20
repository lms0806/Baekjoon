import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		int[] rr = new int[n], cc = new int[m];
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == 1) {
				rr[Integer.parseInt(st.nextToken()) - 1] += Integer.parseInt(st.nextToken());
			}
			else {
				cc[Integer.parseInt(st.nextToken()) - 1] += Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] answer = new int[n][m];
		for(int i = 0; i < n; i++) {
			if(rr[i] != 0) {
				for(int j = 0; j < m; j++) {
					answer[i][j] += rr[i];
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			if(cc[i] != 0) {
				for(int j = 0; j < n; j++) {
					answer[j][i] += cc[i];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int[] arr : answer) {
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
