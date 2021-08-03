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
			String s = st.nextToken(), s1 = st.nextToken();
			
			if(s.equals("#")){
				break;
			}
			
			int size = Integer.parseInt(br.readLine());
			
			int n = 0, n1 = 0;
			while(size --> 0) {
				st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals(st.nextToken())) {
					n++;
				}
				else {
					n1++;
				}
			}
			sb.append(s).append(" ").append(n).append(" ").append(s1).append(" ").append(n1).append("\n");
		}
		System.out.print(sb);
	}
}
