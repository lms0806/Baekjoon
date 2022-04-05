import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x1 = Long.parseLong(st.nextToken()), y1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken()), y2 = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long x3 = Long.parseLong(st.nextToken()), y3 = Long.parseLong(st.nextToken());
		long x4 = Long.parseLong(st.nextToken()), y4 = Long.parseLong(st.nextToken());
		
		if(x2 < x3 | x1 > x4 || y1 < y4 || y2 > y3) {
			System.out.print(0);
		}
		else {
			System.out.print(Math.abs((Math.min(x2,  x4) - Math.max(x1, x3)) * (Math.max(y2,  y4) - Math.min(y1, y3))));
		}
	}
}
