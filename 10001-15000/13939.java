import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		int answer = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' && !s.matches(".*[0-9].*")) {
				answer++;
			}
			if(s.contains(".") || s.contains("!") || s.contains("?")) {
				sb.append(answer).append("\n");
				answer = 0;
			}
		}
		System.out.print(sb);
	}
}
