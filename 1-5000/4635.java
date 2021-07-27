import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			int[][] num = new int[n][2];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				num[i][0] = Integer.parseInt(st.nextToken());
				num[i][1] = Integer.parseInt(st.nextToken());
			}
			
			int answer = num[0][0] * num[0][1];
			for(int i = n - 1; i >= 1; i--) {
				answer += (num[i][1] - num[i - 1][1]) * num[i][0];
			}
			
			sb.append(answer).append(" miles").append("\n");
		}
		System.out.print(sb);
	}
}
