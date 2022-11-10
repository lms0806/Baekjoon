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
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			boolean easy = false, hard = false;
			for(int i = 0; i < n; i++) {
				int num = Integer.parseInt(st.nextToken());
				if(i == 0) {
					if(num == a) {
						easy = true;
					}
				}
				if(i == n - 1) {
					if(num == b) {
						hard = true;
					}
				}
			}
			
			sb.append(easy && hard ? "BOTH" : easy ? "EASY" : hard ? "HARD" : "OKAY").append("\n");
		}
		System.out.print(sb);
	}
}
