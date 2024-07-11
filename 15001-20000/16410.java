import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
		
		int dx = 0, dy = 0;
		if(x < x1) {
			dx = x1 - x;
		}
		if(x2 < x) {
			dx = x - x2;
		}
		
		if(y < y1) {
			dy = y1 - y;
		}
		if(y2 < y) {
			dy = y - y2;
		}
		
		System.out.print(Math.sqrt(dx * dx + dy * dy));
	}
}
