import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			if(n + m + p == 0) {
				break;
			}
			
			int sum = 0, res = 0;
			for(int i = 1; i <= n; i++) {
				int num = Integer.parseInt(br.readLine());
				
				sum += num;
				
				if(i == m) {
					res = num;
				}
			}
			
			if(res != 0) {
				res = (sum * (100 - p)) / res;
			}
			
			sb.append(res).append("\n");
		}
		System.out.print(sb);
	}
}
