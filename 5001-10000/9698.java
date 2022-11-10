import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour = Integer.parseInt(st.nextToken()), minute = Integer.parseInt(st.nextToken()) - 45;
			
			if(minute < 0) {
				hour--;
				minute += 60;
			}
			
			if(hour < 0) {
				hour += 24;
			}
			
			sb.append("Case #").append(i).append(": ").append(hour).append(" ").append(minute).append("\n");
		}
		System.out.print(sb);
	}
}
