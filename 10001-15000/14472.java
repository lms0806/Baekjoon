import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		char[][] ch = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= m - d; j++) {
				int count = 0;
				for(int k = j; k < j + d; k++) {
					if(ch[i][k] == '.') {
						count++;
					}
				}
				answer += check(count, d);
			}
		}//가로
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j <= n - d; j++) {
				int count = 0;
				for(int k = j; k < j + d; k++) {
					if(ch[k][i] == '.') {
						count++;
					}
				}
				answer += check(count, d);
			}
		}//세로
		System.out.print(answer);
	}
	
	public static int check(int count, int d) {
		return count == d ? 1 : 0;
	}
}
