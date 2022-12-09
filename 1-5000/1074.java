import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int r, c;
	static int answer = 0;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		solve(0, 0, (int)Math.pow(2, n));
		
		//System.out.print(answer);
	}
	
	public static void solve(int x, int y, int n) {
		if(x == r && y == c) {
			System.out.print(answer);
			return;
		}
		
		if(c >= y && c < y + n && r >= x && r < x + n) {
			solve(x, y, n / 2);
			solve(x, y + n / 2, n / 2);
			solve(x + n / 2, y, n / 2);
			solve(x + n / 2, y + n / 2, n / 2);
		}
		else {
			answer += n * n;
		}
	}
}
