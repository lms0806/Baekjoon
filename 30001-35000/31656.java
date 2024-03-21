import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(i - 1)) {
				sb.append(s.charAt(i - 1));
			}
		}
		sb.append(s.charAt(s.length() - 1));
		
		System.out.print(sb);
	}
}
