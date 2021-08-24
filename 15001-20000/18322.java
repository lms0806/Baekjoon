import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int size = Integer.parseInt(st.nextToken());
				
		String answer = "";
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int n = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(n + s.length() > size) {
				sb.append(answer.trim()).append("\n");
				answer = "";
				n = 0;
			}
			n += s.length();
			answer += s + " ";
		}
		System.out.print(sb + answer.trim());
	}
}
