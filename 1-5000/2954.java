import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				sb.append(ch);
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					i+=2;
				}
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
}
