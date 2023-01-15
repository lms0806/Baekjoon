import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int time = 1;
		boolean timeleaf = false;
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			boolean clap = false, usetimeleaf = false;
			if(time == num) {
				clap = true;
			}
			if(name.equals("HOURGLASS")) {
				usetimeleaf = true;
				if(!clap) {
					timeleaf = !timeleaf;
				}
			}
			
			
			sb.append(time).append(" ");
			if(clap && !usetimeleaf) {
				sb.append("YES");
			}
			else {
				sb.append("NO");
			}
			sb.append("\n");
			
			if(timeleaf) {
				time--;
				if(time == 0) {
					time = 12;
				}
			}
			else {
				time++;
				if(time > 12) {
					time = 1;
				}
			}
		}
		System.out.print(sb);
	}
}
