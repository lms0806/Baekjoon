import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String s = br.readLine();
		int x = s.charAt(0) - 'A', y = s.charAt(1) - '1';
		
		boolean[][] visited = new boolean[6][6];
		
		int sx = x, sy = y;
		boolean flag = false;
		for(int i = 0; i < 36; i++) {
			int nx, ny;
			if(i == 35) {
				nx = sx;
				ny = sy;
			}
			else {
				s = br.readLine();
				
				nx = s.charAt(0) - 'A';
				ny = s.charAt(1) - '1';
			}
			
			if(!visited[nx][ny] && ((Math.abs(x - nx) == 2 && Math.abs(y - ny) == 1) || (Math.abs(x - nx) == 1 && Math.abs(y - ny) == 2))) {
				visited[nx][ny] = true;
			}
			else {
				flag = true;
				break;
			}
			
			x = nx;
			y = ny;
		}
		
		System.out.print(flag ? "Invalid" : "Valid");
	}
}
