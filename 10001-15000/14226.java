import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print(bfs(Integer.parseInt(br.readLine())));
	}
	
	public static int bfs(int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[1001][1001];
		queue.add(new int[] {1, 0, 0});
		visited[1][0] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n) {
				return now[2];
			}
			
			if(now[0] > 0 && now[0] < 1001) {
				if(!visited[now[0]][now[0]]) {
					visited[now[0]][now[0]] = true;
					queue.add(new int[] {now[0], now[0], now[2] + 1});
				} //복사
				if(!visited[now[0] - 1][now[1]]) {
					visited[now[0] - 1][now[1]] = true;
					queue.add(new int[] {now[0] - 1, now[1], now[2] + 1});
				} //삭제
			}
			
			if(now[1] >= 0 && now[0] + now[1] < 1001) {
				if(!visited[now[0] + now[1]][now[1]]) {
					visited[now[0] + now[1]][now[1]] = true;
					queue.add(new int[] {now[0] + now[1], now[1], now[2] + 1});
				} //붙여넣기
			}
		}
		return 0;
	}
}
