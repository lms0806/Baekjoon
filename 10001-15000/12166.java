import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			String s = st.nextToken();
			
			int answer = 0, count = 0;
			for(int i = 0; i < s.length(); i++) {
				int num = s.charAt(i) - '0';
				
				if(count >= i) {
					count += num;
				}
				else {
					if(num != 0) {
						answer += i - count;
						count = num + i;
					}
				}
			}
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
