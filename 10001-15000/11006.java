import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n,m,u = 0, t = 0;
		
		int size = Integer.parseInt(br.readLine());
		
        	StringBuilder sb = new StringBuilder();
		while(size-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			u = m*2-n;
			t = m-u;
			sb.append(u).append(" ").append(t).append("\n");
		}
        	System.out.print(sb);
	}
}
