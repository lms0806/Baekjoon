import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = 0;
		StringBuilder sb = new StringBuilder();
		while(n < s.length()) {
			sb.append(s.charAt(n));
			
			n += (s.charAt(n) - 'A' + 1);
		}
		System.out.print(sb);
	}
}
