import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		char[] c = br.readLine().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < c.length; i++) {
			if(c[i] == 'J') {
				sb.append(c[i - 1]).append("\n");
			}
		}
		System.out.print(sb);
	}
}
