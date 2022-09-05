import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		ArrayList<Point>[] arr = new ArrayList[10001];
		for(int i = 0; i <= 10000; i++){
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr[s].add(new Point(e, cost));
		}
		
		int[] dist = new int[10001];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		int prev = -1;
		for(int i = 0; i <= d; i++) {
			if(i > 0) {
				prev = dist[i - 1];
			}
			
			dist[i] = Math.min(dist[i], prev + 1);
			
			for(Point next : arr[i]) {
				if(dist[next.x] > dist[i] + next.y) {
					dist[next.x] = dist[i] + next.y;
				}
			}
		}
		System.out.print(dist[d]);
	}
}
