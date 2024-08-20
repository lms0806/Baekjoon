import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken()), y = Double.parseDouble(st.nextToken());
			
			if(x == 0 && y == 0) {
				break;
			}
			
			int hour = (int) Math.ceil((x * x + y * y) * Math.PI / 100);
			
			sb.append("The property will be flooded in hour ").append(hour).append(".\n");
		}
		System.out.print(sb);
	}
}
