import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken(), b = st.nextToken();
		
		int size = Math.min(a.length(), b.length());
		
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while(sb.length() < size) {
			if(!flag) {
				sb.append(a.charAt(sb.length()));
				flag = true;
			}
			else {
				sb.append(b.charAt(sb.length()));
				flag = false;
			}
		}
		System.out.print(sb);
	}
}
