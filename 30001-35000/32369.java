import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int x = 1, y = 1;
		while(n --> 0) {
			x += a;
			y += b;
			
			if(x < y) {
				int temp = x;
				x = y;
				y = temp;
			}
			else if(x == y) {
				y--;
			}
		}
		System.out.print(x + " " + y);
	}
}
