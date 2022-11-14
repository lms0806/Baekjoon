import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			long[][] mission = new long[n][3];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 3; j++) {
					mission[i][j] = Long.parseLong(st.nextToken());
				}
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
			
			long answer = 0;
			for(int i = 0; i < n; i++) {
				long sum = k * mission[i][0] - d * mission[i][1] + a * mission[i][2];
				
				if(sum > 0) {
					answer += sum;
				}
			}
			
			sb.append(Math.max(answer, 0)).append("\n");
		}
		System.out.print(sb);
	}
}
