import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<int[]> arr;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startx = Integer.parseInt(st.nextToken()), starty = Integer.parseInt(st.nextToken());
			
			arr = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				arr.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
			}
			
			st = new StringTokenizer(br.readLine());
			int endx = Integer.parseInt(st.nextToken()), endy = Integer.parseInt(st.nextToken());
			
			sb.append(bfs(startx, starty, endx, endy)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs(int startx, int starty, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		queue.add(new int[] {startx, starty});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(Math.abs(endx - now[0]) + Math.abs(endy - now[1]) <= 1000) {
				return "happy";
			}
			
			for(int i = 0; i < arr.size(); i++) {
				if(!visited[i]) {
					int d = Math.abs(now[0] - arr.get(i)[0]) + Math.abs(now[1] - arr.get(i)[1]);
					
					if(d <= 1000) {
						queue.add(new int[] {arr.get(i)[0], arr.get(i)[1]});
						visited[i] = true;
					}
				}
			}
		}
		
		return "sad";
	}
}
