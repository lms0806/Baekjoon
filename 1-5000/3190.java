import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] board = new int[n][n];
		
		int k = Integer.parseInt(br.readLine());
		while(k --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			board[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
		}
		
		int l = Integer.parseInt(br.readLine());
		
		Queue<Node> queue = new LinkedList<>();
		while(l --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			queue.add(new Node(Integer.parseInt(st.nextToken()), st.nextToken().charAt(0)));
		}
		
		int answer = 1;
		int x = 0, y = 0, idx = 0;
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		Queue<int[]> tail = new LinkedList<>();
		tail.add(new int[] {0, 0});
		board[x][y] = 2;
		while(true) {
			x += dx[idx];
			y += dy[idx];
			
			if(!queue.isEmpty() && queue.peek().time == answer) {
				char c = queue.poll().change;
				
				if(c == 'D') {
					idx++;
				}
				else {
					idx--;
				}
				
				if(idx < 0) {
					idx += 4;
				}
				if(idx > 3) {
					idx = 0;
				}
			}
			if(x < 0 || x >= n || y < 0 || y >= n || board[x][y] == 2) {
				break;
			}
			
			if(board[x][y] == 0) {
				int[] now = tail.poll();
				
				board[now[0]][now[1]] = 0;
			}
			board[x][y] = 2;
			tail.add(new int[] {x, y});
			
			answer++;
		}
		System.out.print(answer);
	}
}

class Node{
	int time;
	char change;
	
	public Node(int time, char change) {
		this.time = time;
		this.change = change;
	}
}
