import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		char[][] ch = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		System.out.print(solve(ch, n, m, false, '-') + solve(ch, m, n, true, '|'));
	}
	
	public static int solve(char[][] ch, int n, int m, boolean check, char c) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int num = 0;
			for(int j = 0; j < m; j++) {
				if(!check) {
					if(ch[i][j] == c) {
						num++;
					}
					else {
						if(num != 0) {
							answer++;
						}
						num = 0;
					}
				}
				else {
					if(ch[j][i] == c) {
						num++;
					}
					else {
						if(num != 0) {
							answer++;
						}
						num = 0;
					}	
				}
			}
			if(num != 0) {
				answer++;
			}
		}
		
		return answer;
	}
}
