import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int minx = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE;
		int miny = Integer.MAX_VALUE, maxy = Integer.MIN_VALUE;
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			minx = Math.min(minx, x);
			maxx = Math.max(maxx, x);
			miny = Math.min(miny, y);
			maxy = Math.max(maxy, y);
		}
		
		System.out.print((int)Math.pow(Math.max(maxx - minx, maxy - miny), 2));
	}
}
