import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			int b = 0, c = 0, m = 0, w = 0;
			for(char ch : st.nextToken().toCharArray()) {
				if(ch == 'B') {
					b += 2;
				}
				else if(ch == 'C') {
					c++;
				}
				else if(ch == 'M') {
					m += 4;
				}
				else {
					w += 3;
				}
			}
			
			sb.append(s).append(": ");
			if(b > c && b > m && b > w) {
				sb.append("The Bobcat is the");
			}
			else if(c > b && c > m && c > w) {
				sb.append("The Coyote is the");
			}
			else if(m > b && m > c && m > w) {
				sb.append("The Mountain Lion is the");
			}
			else if(w > b && w > c && w > m) {
				sb.append("The Wolf is the");
			}
			else {
				sb.append("There is no");
			}
			sb.append(" dominant species").append("\n");
		}
		System.out.print(sb);
	}
}
