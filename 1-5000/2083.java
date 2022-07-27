import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int age = Integer.parseInt(st.nextToken()), weight = Integer.parseInt(st.nextToken());
			
			if(s.equals("#")) {
				break;
			}
			
			sb.append(s).append(" ").append(age > 17 || weight >= 80 ? "Senior" : "Junior").append("\n");
		}
		System.out.print(sb);
	}
}
