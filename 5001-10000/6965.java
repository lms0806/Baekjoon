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
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				if(s.length() == 4) {
					for(int i = 0; i < 4; i++) {
						sb.append("*");
					}
				}
				else {
					sb.append(s);
				}
				sb.append(" ");
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}
