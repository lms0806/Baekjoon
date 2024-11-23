import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			if(d + e == 0) {
				break;
			}
			
			double x = d / 2, y = d - x;
			
			double res = solve(x, y, e);
			
			while(x >= 1) {
				x--;
				y++;
				
				if(solve(x, y, e) >= res) {
					break;
				}
				res = Math.min(solve(x, y, e), res);
			}
			sb.append(res).append("\n");
		}
		System.out.print(sb);
	}
	
	public static double solve(double x, double y, int e) {
		return Math.abs(Math.sqrt(x * x + y * y) - e);
	}
}
