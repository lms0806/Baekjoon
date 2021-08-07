import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();

			if(s.length() == 7 && s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(4) && s.charAt(2) == s.charAt(3) && s.charAt(3) == s.charAt(5) && s.charAt(5) == s.charAt(6) && s.charAt(0) != s.charAt(2)) {
				sb.append(1);
			}
			else {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
