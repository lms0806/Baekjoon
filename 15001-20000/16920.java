import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] dist, count;
	static char[][] board;
	static boolean[] flag;
	static Queue<int[]>[] queue;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		dist = new int[p];
		count = new int[p];
		flag = new boolean[p];
		queue = new LinkedList[p];
		for(int i = 0; i < p; i++) {
			queue[i] = new LinkedList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < p; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		
		board = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				if(board[i][j] >= '1' && board[i][j] <= '9') {
					queue[board[i][j] - '1'].add(new int[] {i, j, dist[board[i][j] - '1']});
					count[board[i][j] - '1']++;
				}
			}
		}
		
		while(true) {
			for(int i = 0; i < p; i++) {
				if(flag[i]) {
					continue;
				}
				boolean check = bfs(i);
				
				if(!check) {
					flag[i] = true;
				}
			}
			
			if(check()) {
				break;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int c : count) {
			sb.append(c).append(" ");
		}
		System.out.print(sb);
	}
	
	public static boolean bfs(int num) {
		Queue<int[]> nq = new LinkedList<>();
		
		while(!queue[num].isEmpty()) {
			nq.add(queue[num].poll());
		}
		
		boolean check = false;
		while(!nq.isEmpty()) {
			int[] now = nq.poll();
			
			if(now[2] == 0) {
				continue;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(board[nx][ny] == '.') {
						queue[num].add(new int[] {nx, ny, dist[num]});
						nq.add(new int[] {nx, ny, now[2] - 1});
						board[nx][ny] = (char)(num + '1');
						count[num]++;
						check = true;
					}
				}
			}
		}
		return check;
	}
	
	public static boolean check() {
		for(boolean f : flag) {
			if(!f) {
				return false;
			}
		}
		return true;
	}
}
