import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			char ch = st.nextToken().charAt(0);
			
			int size = ch == 'c' ? 2 : ch == 'i' ? 8 : 16;
			
			long answer = Long.parseLong(s.substring(i, i + size), 16);
			
			i += size;
			sb.append(answer).append(" ");
		}
		System.out.print(sb);
	}
}
