import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			int answer = 0, checknum = -1;
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				checknum = (num == k || num == checknum - 1) ? num : -1;
				if(checknum == 1) {
					answer++;
				}
			}
			sb.append("Case #").append(i).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
