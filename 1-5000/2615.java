import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] num = new int[21][21];
	static int[][][] memo = new int[21][21][4];
	static int[] dx = {1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1; i <= 19; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 19; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		for(int i = 1; i <= 19; i++) {
			for(int j = 1; j <= 19; j++) {
				if(num[j][i] != 0) {
					for(int k = 0; k < 4; k++) {
						if(memo[j][i][k] == 0 && calc(j, i, k, num[j][i]) == 5) {
							return num[j][i] + "\n" + j + " " + i;
						}
					}
				}
			}
		}
		return "0";
	}
	
	public static int calc(int i, int j, int k, int check) {
		int r = i + dx[k];
		int c = j + dy[k];
		
		if(num[r][c] == check) {
			return memo[r][c][k] = calc(r, c, k, check) + 1;
		}
		return 1;
	}
}
