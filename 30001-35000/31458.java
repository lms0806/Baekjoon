import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int num = 0;
			if((s.contains("0") && s.indexOf('0') != s.length() - 1) || s.contains("1")) {
				num = 1;
			}
			
			s = s.substring(0, s.contains("0") ? s.indexOf('0') + 1 : s.indexOf('1') + 1);
			
			if(s.length() != 0 && s.length() % 2 == 0) {
				num = num == 0 ? 1 : 0;
			}
			
			sb.append(num).append("\n");
		}
		System.out.print(sb);
	}
}
