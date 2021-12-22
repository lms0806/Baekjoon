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
			
			sb.append(st.nextToken()).append(" ");
			
			String s = st.nextToken();
			
			try {
				sb.append(Integer.parseInt(s, 8));
			}catch(Exception e) {
				sb.append(0);
			}
			sb.append(" ").append(Integer.parseInt(s)).append(" ").append(Integer.parseInt(s, 16)).append("\n");
		}
		System.out.print(sb);
	}
}
