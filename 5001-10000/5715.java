import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("*")) {
				break;
			}
			
			int answer = 0;
			StringTokenizer st = new StringTokenizer(s, "/");
			while(st.hasMoreTokens()) {
				double num = 0;
				for(char ch : st.nextToken().toCharArray()) {
					if(ch == 'W') {
						num++;
					}
					else if(ch == 'H') {
						num += 0.5;
					}
					else if(ch == 'Q') {
						num += 0.25;
					}
					else if(ch == 'E') {
						num += 0.125;
					}
					else if(ch == 'S') {
						num += 0.0625;
					}
					else if(ch == 'T') {
						num += 0.03125;
					}
					else {
						num += 0.015625;
					}
				}
				if(num == 1) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
