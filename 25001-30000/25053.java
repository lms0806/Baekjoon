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
			int n = Integer.parseInt(br.readLine());
			
			if(n < 10) {
				while(n --> 0) {
					br.readLine();
				}
				sb.append("MOREPROBLEMS");
			}
			else {
				int[] num = new int[11];
				while(n --> 0) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					int score = Integer.parseInt(st.nextToken()), problem = Integer.parseInt(st.nextToken());
					
					num[problem] = Math.max(num[problem], score);
				}
				
				int count = 0, sum = 0;
				for(int i = 1; i < 11; i++) {
					if(num[i] == 0) {
						break;
					}
					count++;
					sum += num[i];
				}
				
				sb.append(count == 10 ? sum : "MOREPROBLEMS");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
