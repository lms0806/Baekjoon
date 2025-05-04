import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n + m == 0) {
				break;
			}
			
			int[][] arr = new int[n][2];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				st.nextToken();
				
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken()) + arr[i][0];
			}
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()) + s;
				
				int answer = 0;
				for(int i = 0; i < n; i++) {
					if(s < arr[i][1] && arr[i][0] < e) {
						answer++;
					}
				}
				sb.append(answer).append("\n");
			}
		}
		System.out.print(sb);
	}
}
