import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] visited = new boolean[2001][2001];
		
		br.readLine();
		int answer = 1, x = 1000, y = 1000;
		visited[x][y] = true;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'E') {
				y--;
			}
			else if(c == 'W') {
				y++;
			}
			else if(c == 'N') {
				x--;
			}
			else if(c == 'S') {
				x++;
			}
			
			if(!visited[x][y]) {
				visited[x][y] = true;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
