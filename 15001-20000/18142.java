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
			if(!str.equals("tapioka") && !str.equals("bubble")) {
				sb.append(str).append(" ");
			}
		}
		System.out.print(sb.length() == 0 ? "nothing" : sb);
	}
}
