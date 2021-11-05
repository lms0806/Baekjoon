import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == now[1]) {
				return now[2];
			}
			
			int nextx = now[0] * 2;
			int nexty = now[1] + 3;
			
			if(nextx <= nexty) {
				queue.add(new int[] {nextx, nexty, now[2] + 1});
			}
			
			queue.add(new int[] {now[0] + 1, now[1], now[2] + 1});
		}
		return 0;
	}
}
