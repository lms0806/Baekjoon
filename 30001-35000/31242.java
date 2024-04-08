import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[4][5];
		
		int x = 0, y = 0;
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 1) {
					x = i;
					y = j;
				}
			}
		}
		
		int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
		int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
		
		int num = 2;
		while(true) {
			boolean flag = false;
			for(int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < 4 && ny >= 0 && ny < 5 && arr[nx][ny] == num) {
					x = nx;
					y = ny;
					num++;
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				break;
			}
		}
		System.out.print(num - 1);
	}
}
