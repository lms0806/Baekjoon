import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		int minx = 50, maxx = 50;
		int miny = 50, maxy = 50;
		
		int idx = 0;
		int sx = 50, sy = 50;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, -1, 0, 1};
		
		ArrayList<Node> arr = new ArrayList<>();
		arr.add(new Node(sx, sy));
		for(char c : br.readLine().toCharArray()) {
			if(c == 'L') {
				idx--;
				
				if(idx < 0) {
					idx += 4;
				}
			}
			else if(c == 'R') {
				idx++;
				
				if(idx > 3) {
					idx -= 4;
				}
			}
			else {
				sx += dx[idx];
				sy += dy[idx];
				
				arr.add(new Node(sx, sy));
				
				minx = Math.min(minx, sx);
				miny = Math.min(miny, sy);
				
				maxx = Math.max(maxx, sx);
				maxy = Math.max(maxy, sy);
			}
		}
		
		char[][] board = new char[maxx - minx + 1][maxy - miny + 1];
		
		for(int i = 0; i < board.length; i++) {
			Arrays.fill(board[i], '#');
		}
		
		for(Node node : arr) {
			board[node.x - minx][node.y - miny] = '.';
		}
		
		StringBuilder sb = new StringBuilder();
		for(char[] c : board) {
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}

class Node{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
