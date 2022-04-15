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
			
			int r0 = Integer.parseInt(st.nextToken()), w0 = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			
			if(r0 == w0 && w0 == c && c == r && r == 0) {
				break;
			}
			
			for(int i = 0; ; i++) {
				if(r0 + r * i >= c * w0) {
					sb.append(i).append("\n");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
