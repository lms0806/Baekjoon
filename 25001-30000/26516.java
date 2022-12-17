import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder answer = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int max = 0, num;
			for(char c : s.toCharArray()) {
				max = Math.max(max, c - '0');
			}
			
			if(max % 2 == 0) {
				num = (max + 4) % 10;
			}
			else {
				num = 0;
			}
			
			boolean flag = false;
			StringBuilder sb = new StringBuilder();
			for(char c : s.toCharArray()) {
				if(!flag && c - '0' == max) {
					sb.append(num);
					flag = true;
				}
				else {
					sb.append(c);
				}
			}
			answer.append(Integer.parseInt(sb.toString())).append("\n");
		}
		System.out.print(answer);
	}
}
