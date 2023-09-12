import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		
		char[][][] arr = new char[h][n][m];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = br.readLine().toCharArray();
			}
		}
		
		int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1};
		int[] dz = {-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(arr[i][j][k] == '*') {
						sb.append("*");
						continue;
					}
					
					int count = 0;
					for(int l = 0; l < 26; l++) {
						int nx = i + dx[l];
						int ny = j + dy[l];
						int nz = k + dz[l];
						
						if(nx >= 0 && nx < h && ny >= 0 && ny < n && nz >= 0 && nz < m) {
							if(arr[nx][ny][nz] == '*') {
								count++;
							}
						}
					}
					sb.append(count % 10);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
