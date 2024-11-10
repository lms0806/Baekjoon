import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		System.out.print(n == k ? 0 : bfs());
	}
	
	public static int bfs() {
		Queue<Integer> queue = new LinkedList<>();
		boolean[][] visited = new boolean[2][500001];
		queue.add(n);
		
		int move = 1;
		while(!queue.isEmpty()) {
			k += move;
			
			if(k > 500000) {
				return -1;
			}
			
			if(visited[move % 2][k]) {
				return move;
			}
			
			int size = queue.size();
			
			for(int i = 0; i < size; i++) {
				int x = queue.poll();
				
				for(int nx : new int[]{x + 1, x - 1, x << 1}) {
					if(nx == k) {
						return move;
					}
					
					if(nx < 0 || nx > 500000 || visited[move % 2][nx]) {
						continue;
					}
					visited[move % 2][nx]  = true;
					queue.add(nx);
				}
			}
			
			move++;
		}
		return -1;
	}
}
