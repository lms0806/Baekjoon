import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			int size = Integer.parseInt(br.readLine().trim());
			
			while(size --> 0) {
				st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals("S")) {
					n -= Integer.parseInt(st.nextToken());
					if(n < 0) {
						n = 0;
					}
				}
				else {
					n += Integer.parseInt(st.nextToken());
					if(n > max) {
						n = max;
					}
				}
			}
			sb.append(s).append(" ").append(n).append("\n");
		}
		System.out.print(sb);
	}
}
