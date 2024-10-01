import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		if(a % 10 == b / 10) {
			sb.append("'").append(b % 10);
		}
		else {
			sb.append(b);
		}
		
		if(b % 10 == c / 10) {
			sb.append("'").append(c % 10);
		}
		else {
			sb.append(c);
		}
		System.out.print(sb);
	}
}
