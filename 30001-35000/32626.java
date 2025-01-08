import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sx = Integer.parseInt(st.nextToken()), sy = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ex = Integer.parseInt(st.nextToken()), ey = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int px = Integer.parseInt(st.nextToken()), py = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(sx, sy, ex, ey, px, py));
	}
	
	public static int solve(int sx, int sy, int ex, int ey, int px, int py) {
		if(sx != ex && sy != ey) {
			return 1;
		}
		
		if(sx == ex) {
			return px != sx ? 0 : ((sy <= py && py <= ey) || (sy >= py && py >= ey)) ? 2 : 0;
		}
		
		if(sy == ey) {
			return py != sy ? 0 : ((sx <= px && px <= ex) || (sx >= px && px >= ex)) ? 2 : 0;
		}
		return 0;
	}
}
