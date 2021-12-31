import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n - 3; i++) {
			for(int j = 0; j < m; j++) {
				answer = max(answer, arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j]);
			}
		}// 세로 한줄
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m - 3; j++) {
				answer = max(answer, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3]);
			}
		}// 가로 한 줄
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 1; j++) {
				answer = max(answer, arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1]);
			}
		} // 네모
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < m - 1; j++) {
				answer = max(answer, max(arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1], arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1]));
			}
		} // ㄴ
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 2; j++) {
				answer = max(answer, max(arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2] + arr[i][j + 2], arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j]));
			}
		}// 뒤집은
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < m - 1; j++) {
				answer = max(answer, max(arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j], arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 2][j]));
			}
		}
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 2; j++) {
				answer = max(answer, max(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2], arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2]));
			}
		}
		
		for(int i = 0; i < n - 2; i ++) {
			for(int j = 0; j < m - 1; j++) {
				answer = max(answer, max(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1], arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 2][j]));
			}
		}
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 2; j++) {
				answer = max(answer, max(arr[i + 1][j] + arr[i + 1][j + 1] + arr[i][j + 1] + arr[i][j + 2], arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2]));
			}
		}
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < m - 2; j++) {
				answer = max(answer, max(arr[i + 1][j] + arr[i + 1][j + 1] + arr[i][j + 1] + arr[i + 1][j + 2], arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i][j + 2]));
			}
		}//ㅗ, ㅜ
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < m - 1; j++) {
				answer = max(answer, max(arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j], arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 2][j + 1]));
			}
		}//ㅏ, ㅓ
		System.out.print(answer);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
