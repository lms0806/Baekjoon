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
			int n = Integer.parseInt(br.readLine());
			
			int sumc = 0;
			double sumg = 0;
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				double g = Double.parseDouble(st.nextToken());
				
				sumc += c;
				sumg += (c * g);
			}
			sb.append(sumc).append(" ").append(Math.round(10 * sumg / sumc) / 10.0).append("\n");
		}
		System.out.print(sb);
	}
}
