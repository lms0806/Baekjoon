import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			int a = Integer.parseInt(s.substring(s.indexOf("R") + 1, s.indexOf("C")));
			int b = Integer.parseInt(s.substring(s.indexOf("C") + 1));
			
			if(a == 0 && b == 0) {
				break;
			}
			
			StringBuilder sbs = new StringBuilder();
			while(b > 0) {
				b--;
				sbs.append((char)(b % 26 + 'A'));
				b /= 26;
			}
			
			sb.append(sbs.reverse()).append(a).append("\n");
		}
		System.out.print(sb);
	}
}
