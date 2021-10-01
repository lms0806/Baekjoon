import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int x = 0, y = 0, check = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int dir = Integer.parseInt(st.nextToken());
			
			if(s.equals("MOVE")) {
				if(check == 0) {
					x += dir;
				}
				else if(check == 2) {
					x -= dir;
				}
				else {
					y = check == 1 ? y + dir : y - dir;
				}
				
				if(x < 0 || x > m || y < 0 || y > m) {
					x = -1;
					break;
				}
			}
			else {
				check += dir == 0 ? 1 : -1;
				if(check > 3) {
					check = 0;
				}
				if(check < 0) {
					check = 3;
				}
			}
		}
		System.out.print(x < 0 || y < 0 ? -1 : x + " " + y);
	}
}
