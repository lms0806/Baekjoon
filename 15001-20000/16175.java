import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[m][n];
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int answer = 0, idx = 0;
			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = 0; j < m; j++) {
					sum += arr[j][i];
				}
				
				if(answer < sum) {
					answer = sum;
					idx = i + 1;
				}
			}
			
			sb.append(idx).append("\n");
		}
		System.out.print(sb);
	}
}
