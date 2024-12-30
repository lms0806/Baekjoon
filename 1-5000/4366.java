import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		double total = 0;
		int start = 0, speed = 0;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			String ss = st.nextToken();
			String[] str= ss.split(":");
			
			int time = Integer.parseInt(str[0]) * 60 * 60 + Integer.parseInt(str[1]) * 60 + Integer.parseInt(str[2]);
			
			total += (time - start) * speed / 3600.0;
			if(st.hasMoreTokens()) {
				start = time;
				speed = Integer.parseInt(st.nextToken());
			}
			else {
				start = time;
				sb.append(String.format("%s %.2f km\n", ss, total));
			}
		}
		System.out.print(sb);
	}
}
