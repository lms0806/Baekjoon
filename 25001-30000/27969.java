import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int answer = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			char c = s.charAt(0);
			
			if(c == '[' || (c >= '0' && c <= '9')) {
				answer += 8;
			}
			else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				answer += 12 + s.length();
			}
		}
		System.out.print(answer);
	}
}
