import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			String[] s = new String[n];
			
			int idx = 0;
			while(idx < n) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				while(st.hasMoreTokens()) {
					s[idx] = st.nextToken();
					idx++;
				}
			}
			
			String[] str = s.clone();
			Arrays.sort(str);
			
			int answer = 0;
			for(int i = 0; i < s.length; i++) {
				for(int j = 0; j < s.length; j++) {
					if(s[i].equals(str[j])) {
						answer += Math.abs(i - j);
					}
				}
			}
			
			sb.append("Site ").append(t).append(": ").append(answer).append("\n");
			t++;
		}
		System.out.print(sb);
	}
}
