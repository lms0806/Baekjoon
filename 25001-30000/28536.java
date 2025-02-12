import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int len = 0;
		int[] wordStart = new int[n];
		st = new StringTokenizer(br.readLine().trim());
		for(int i = 0; i < n; i++) {
			wordStart[i] = len + 1;
			len += st.nextToken().length();
		}
		
		StringBuilder sb = new StringBuilder();
		while(m != 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				m--;
				int num = Integer.parseInt(st.nextToken());
				
				int idx = 0;
				for(int i = 0; i < n; i++) {
					if(wordStart[i] <= num) {
						idx = i;
					}
					else {
						break;
					}
				}
				sb.append(idx + 1).append(" ").append(num - wordStart[idx] + 1).append("\n");
			}
		}
		System.out.print(sb);
	}
}
