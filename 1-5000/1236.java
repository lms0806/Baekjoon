import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[n][m];
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];
		
		for(int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();
			for(int j = 0; j < m ; j++) {
				if(map[i][j] == 'X') {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		int r = 0, c = 0;
		for(int i = 0; i < n; i++) {
			if(!row[i]) {
				r++;
			}
		}
		for(int i = 0; i < m; i++) {
			if(!col[i]) {
				c++;
			}
		}
		System.out.print(r > c ? r : c);
	}
}
