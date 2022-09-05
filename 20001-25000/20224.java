import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			String s = br.readLine().replaceAll(" ", "");
			
			int answer = 0;
			for(int i = 0; i <= s.length() - 4; i++) {
				if(s.charAt(i) == '2' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '2' && s.charAt(i + 3) == '0') {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
