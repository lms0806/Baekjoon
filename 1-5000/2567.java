import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] num = new boolean[100][100];
		
		int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
		
		int size = Integer.parseInt(br.readLine());
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			for(int i = a; i < a + 10; i++) {
				for(int j = b; j < b + 10; j++) {
					num[i][j] = true;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(num[i][j]) {
					for(int k = 0; k < 4; k++) {
						int x = i + dx[k], y = j + dy[k];
                        
						if(x < 0 || y < 0 || x > 99 || y > 99 || !num[x][y]) {
							answer++;
						}
					}
				}
			}
		}
		System.out.print(answer);
	}
}
