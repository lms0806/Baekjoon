import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] d = new int[2];
	static int f;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		
		d[0] = Integer.parseInt(st.nextToken());
		d[1] = -Integer.parseInt(st.nextToken());
		
		System.out.print(bfs(s, g));
	}
	
	public static String bfs(int s, int g) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[f + 1];
		queue.add(new int[] {s, 0});
		visited[s] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == g) {
				return now[1] + "";
			}
			
			for(int i = 0; i < 2; i++) {
				int ns = now[0] + d[i];
				
				if(ns >= 1 && ns <= f) {
					if(!visited[ns]) {
						queue.add(new int[] {ns, now[1] + 1});
						visited[ns] = true;
					}
				}
			}
		}
		
		return "use the stairs";
	}
}
