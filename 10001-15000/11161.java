import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int m = Integer.parseInt(br.readLine());
			
			int min = Integer.MAX_VALUE, sum = 0;
			while(m --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				sum += Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
				
				min = Math.min(min, sum);
			}
			
			sb.append(Math.max(-min, 0)).append("\n");
		}
		System.out.print(sb);
	}
}
