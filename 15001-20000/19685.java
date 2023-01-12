import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(long i = a; i <= b; i++) {
			String s = String.valueOf(i);
			
			if(s.equals(new StringBuilder(s).reverse().toString())) {
				sb.append("Palindrome!");
			}
			else {
				sb.append(i);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
