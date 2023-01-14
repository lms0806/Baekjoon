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
			
			int idx = -1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				s[i] = st.nextToken();
				
				if(s[i].replaceAll("#", "").length() != 0) {
					idx = i;
				}
			}
			
			if(idx == -1) {
				for(String str : s) {
					sb.append(str).append(" ");
				}
			}
			else {
				for(int i = idx + 1; i < n; i++) {
					sb.append(s[i]).append(" ");
				}
				sb.append(s[idx]).append(" ");
				for(int i = 0; i < idx; i++) {
					sb.append(s[i]).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
