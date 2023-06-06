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
			int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				double v = Double.parseDouble(st.nextToken()), f = Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
				
				if(d <= v * (f / c)) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
