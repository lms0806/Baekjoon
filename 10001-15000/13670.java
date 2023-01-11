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
			int h1 = Integer.parseInt(st.nextToken()), m1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken()), m2 = Integer.parseInt(st.nextToken());
			
			if(h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) {
				break;
			}
			
			if(h2 < h1 || (h1 == h2 && m1 > m2)) {
				h2 += 24;
			}
			
			int time1 = h1 * 60 + m1, time2 = h2 * 60 + m2;
			
			sb.append(time2 - time1).append("\n");
		}
		System.out.print(sb);
	}
}
