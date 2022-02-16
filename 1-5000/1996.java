import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] ch = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		int[][] answer = new int[n][n];
		
		int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
		int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(ch[i][j] == '.') {
					for(int k = 0; k < 8; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
							if(ch[nx][ny] != '.') {
								answer[i][j] += ch[nx][ny] - '0';
							}
						}
					}
				}
				else {
					answer[i][j] = -1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(answer[i][j] == -1 ? "*" : answer[i][j] > 9 ? "M" : answer[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
