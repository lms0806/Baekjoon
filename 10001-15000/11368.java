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
			long c = Long.parseLong(st.nextToken()), w = Long.parseLong(st.nextToken());
			long l = Long.parseLong(st.nextToken()), p = Long.parseLong(st.nextToken());
			
			if(c == 0 && w == 0 && l == 0 && p == 0) {
				break;
			}
			
			sb.append((long)(Math.pow(Math.pow(Math.pow(c, w), l), p))).append("\n");
		}
		System.out.print(sb);
	}
}
