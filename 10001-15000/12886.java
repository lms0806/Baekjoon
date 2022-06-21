import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int sum = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		sum = a + b + c;
		
		System.out.print(sum % 3 != 0 ? 0 : bfs(a, b));
	}
	
	public static int bfs(int A, int B) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[1501][1501];
		queue.add(new int[] {A, B});
		visited[A][B] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			int x = now[0];
			int y = now[1];
			int z = sum - x - y;
			
			if(x == y && y == z) {
				return 1;
			}
			
			int[] dx = {x, x, y}, dy = {y, z, z};
			for(int i = 0; i < 3; i++) {
				int a = dx[i], b = dy[i];
				
				if(a < b) {
					b -= a;
					a += a;
				}
				else if(a > b) {
					a -= b;
					b += b;
				}
				else {
					continue;
				}
				
				int c = sum - a - b;
				int X = Math.min(a, Math.min(b, c));
				int Y = Math.max(a, Math.max(b, c));
				
				if(!visited[X][Y]) {
					queue.add(new int[] {X, Y});
					visited[X][Y] = true;
				}
			}
		}
		return 0;
	}
}
