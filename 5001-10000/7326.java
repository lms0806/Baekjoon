import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] dx = {1, 1, 1, -1};
		int[] dy = {1, -1, 1, 1};
		
		HashMap<Point, Integer> map = new HashMap<>();
		int x = 0, y = 0;
		int number = 0, idx = 0;
		while(x < 5000 && y < 5000) {
			map.put(new Point(x, y), number++);
			
			x += dx[idx];
			y += dy[idx];
			
			idx = (idx + 1) % 4;			
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			sb.append(map.containsKey(new Point(a, b)) ? map.get(new Point(a, b)) : "No Number").append("\n");
		}
		
		System.out.print(sb);
	}
}
