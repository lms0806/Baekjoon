import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Point[] points = new Point[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(points, (p1, p2) -> (p1.x == p2.x) ? p2.y - p1.y : p2.x - p1.x);
		
		int answer = 0;
		boolean[] check = new boolean[10001];
		for(int i = 0; i < n; i++) {
			for(int j = points[i].y; j >= 1; j--) {
				if(!check[j]) {
					check[j] = true;
					answer += points[i].x;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
