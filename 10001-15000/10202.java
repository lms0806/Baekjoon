import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int answer = 0, num = 0;
			for(int i = 0; i < n; i++) {
				if(st.nextToken().equals("X")) {
					num++;
				}
				else {
					num = 0;
				}
				
				answer = Math.max(answer, num);
			}
			
			sb.append("The longest contiguous subsequence of X's is of length ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
