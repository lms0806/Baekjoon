import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int answer = 0;
		for(int y = 0; y < n; y++) {
			for(int x = 0; x < m; x++) {
				for(int k = 0; k <= 50; k++) {
					if(!check(y + k, x + k, n, m)) {
						continue;
					}// y랑 x가 범위를 벗어났으면 false
					if(arr[y][x] != arr[y][x + k] || arr[y][x] != arr[y + k][x] || arr[y][x] != arr[y + k][x + k]) {
						continue;
					}//양 꼭지점이 값이 다를 경우
					if(x + k > m && y + k > n) {
						break;
					}
					answer = Math.max(answer, (k + 1) * (k + 1));
				}
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(int y, int x, int n, int m) {
		return 0 <= y && y < n && 0 <= x && x < m;
	}
}
