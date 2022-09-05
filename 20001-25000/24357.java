import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
		int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j] == 9) {
					sb.append(9).append(" ");
					continue;
				}
				
				int count = 0;
				for(int k = 0; k < 8; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
						if(arr[nx][ny] == 9) {
							count++;
						}
					}
				}
				sb.append(count).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
}
