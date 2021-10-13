import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken(), s1 = st.nextToken();
			
			int num = 0;
			for(char c : s.toCharArray()) {
				num += c - '0';
			}
			for(char c : s1.toCharArray()) {
				num -= c - '0';
			}
			sb.append("Swapping letters to make ").append(s).append(" look like ").append(s1).append(num > 0 ? " earned " + num + " coins." : num == 0 ? " was FREE." : " cost " + (-1 * num) + " coins.").append("\n");
		}
		System.out.print(sb);
	}
}
