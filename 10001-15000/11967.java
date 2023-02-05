import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean flag = false;
	static boolean[][] light;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<Node>[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		light = new boolean[n][n];
		arr = new ArrayList[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = new ArrayList<>();
			}
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			arr[x][y].add(new Node(a, b));
		}
		
		light[0][0] = true;
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<Node> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][n];
		queue.add(new Node(0, 0));
		visited[0][0] = true;
		
		int answer = 1;
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			for(Node a : arr[now.x][now.y]) {
				if(!light[a.x][a.y]) {
					answer++;
					light[a.x][a.y] = true;
					
					for(int i = 0; i < 4; i++) {
						int nx = a.x + dx[i];
						int ny = a.y + dy[i];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < n && visited[nx][ny]) {
							queue.add(new Node(a.x, a.y));
							visited[a.x][a.y] = true;
							break;
						}
					}
				}
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if(light[nx][ny] && !visited[nx][ny]) {
						queue.add(new Node(nx, ny));
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return answer;
	}
}
class Node{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
