import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(r == 0 && c == 0) {
				break;
			}
			
			char[][] ch = new char[r][c];
			for(int i = 0; i < r; i++) {
				ch[i] = br.readLine().toCharArray();
			}
			
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					if(ch[i][j] == '*') {
						sb.append('*');
						continue;
					}
					int count = 0;
					for(int k = 0; k < 8; k++) {
						int nr = i + "22210001".charAt(k) - '1';
						int nc = j + "21000122".charAt(k) - '1';
						
						if(check(nr, nc, r, c) && ch[nr][nc] == '*') {
							count++;
						}
					}
					sb.append(count);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean check(int x, int y, int r, int c) {
		if(x < 0 || x >= r || y < 0 || y >= c) {
			return false;
		}
		return true;
	}
}
