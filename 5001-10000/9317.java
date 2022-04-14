import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double d = Double.parseDouble(st.nextToken());
			double rh = Double.parseDouble(st.nextToken()), rv = Double.parseDouble(st.nextToken());
			
			if(d + rh + rv == 0) {
				break;
			}
			
			double w = 16 * d / Math.sqrt(337);
			
			sb.append("Horizontal DPI: ").append(String.format("%.2f", rh / w)).append("\n");
			sb.append("Vertical DPI: ").append(String.format("%.2f", rv / (9 * w / 16))).append("\n");
		}
		System.out.print(sb);
	}
}
