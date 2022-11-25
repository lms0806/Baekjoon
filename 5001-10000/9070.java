import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int answer = 0;
			double max = 100001;
			
			int n = Integer.parseInt(br.readLine());
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
				
				if(max > b / a) {
					max = b / a;
					answer = (int)b;
				}
				else if(max == b / a) {
					answer = Math.min(answer, (int)b);
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
