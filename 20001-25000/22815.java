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
			int cx = 0, cy = 0, mx = 0, my = 0, max = 0;
			
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
				
				if(x == 0 && y == 0) {
					break;
				}
				
				cx += x;
				cy += y;
				
				if(cx * cx + cy * cy > max) {
					mx = cx;
					my = cy;
					max = cx * cx + cy * cy;
				}
				else if(cx * cx + cy * cy == max) {
					if(cx > mx) {
						mx = cx;
						my = cy;
					}
				}
			}
			
			sb.append(mx).append(" ").append(my).append("\n");
		}
		System.out.print(sb);
	}
}
