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
			
			String s = st.nextToken();
			int two = Integer.parseInt(st.nextToken()) - 1;
			int one = (s.charAt(0) - 'A' + 1) + (s.charAt(1) - '1') * 8 - 1;
			
			boolean flaga = (one % 8 + one / 8) % 2 == 1 ? true : false;
			boolean flagb = (two % 8 + two / 8) % 2 == 1 ? true : false;
			
			sb.append(flaga == flagb ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
