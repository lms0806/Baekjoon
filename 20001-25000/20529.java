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
			
			String[] s = new String[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				s[i] = st.nextToken();
			}
			
			if(n > 32) {
				sb.append(0).append("\n");
				continue;
			}
			
			int answer = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					for(int k = j + 1; k < n; k++) {
						int count = 0;
						
						for(int l = 0; l < 4; l++) {
							count += (s[i].charAt(l) != s[j].charAt(l) ? 1 : 0) + (s[i].charAt(l) != s[k].charAt(l) ? 1 : 0) + (s[j].charAt(l) != s[k].charAt(l) ? 1 : 0);
						}
						
						answer = Math.min(answer, count);
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
