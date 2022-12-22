import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char ch = ' ';
			while(st.hasMoreTokens()){
				char c = (char)(Integer.parseInt(st.nextToken()));
				
				if(c >= 'A' && c <= 'Z') {
					c = (char)(c - 'A' + 'a');
				}
				else if(c < 'a' || c > 'z') {
					c = '-';
				}
				
				if(ch == ' ') {
					ch = c;
				}
				else {
					sb.append(c);
				}
			}
			sb.append(ch).append("ay").append("\n");
		}
		System.out.print(sb);
	}
}
