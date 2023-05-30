import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken()), sy = Integer.parseInt(st.nextToken());
		int answer = 0, x = sx, y = sy;
		while(n --> 1) {
			st = new StringTokenizer(br.readLine());
			int nx = Integer.parseInt(st.nextToken()), ny = Integer.parseInt(st.nextToken());
			
			answer += Math.abs(nx + ny - x - y);
			x = nx;
			y = ny;
		}
		answer += Math.abs(x + y - sx - sy);
		
		System.out.print(answer);
	}
}
