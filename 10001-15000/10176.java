import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			char[] c = br.readLine().toUpperCase().replaceAll("[^A-Z]", "").toCharArray();
			
			char[] ch = new char[c.length];
			for(int i = 0; i < c.length; i++) {
				ch[i] = (char) ('Z' - (c[i] - 'A'));
			}
		
			Arrays.sort(c);
			Arrays.sort(ch);
			
			sb.append(solve(c, ch)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(char[] c, char[] ch) {
		for(int i = 0; i < c.length; i++) {
			if(c[i] != ch[i]) {
				return "No";
			}
		}
		return "Yes";
	}
}
