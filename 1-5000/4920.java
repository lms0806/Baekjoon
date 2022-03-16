import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int idx = 1;
		
		while(true) {
			int n = Integer.parseInt(br.readLine().trim());
			
			if(n == 0) {
				break;
			}
			
			int[][] arr = new int[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine().trim());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = -987654321;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n - 3; j++) {
					max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3]);
				}
			}
			for(int i = 0; i < n - 3; i++) {
				for(int j = 0; j < n; j++) {
					max = Math.max(max, arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j]);
				}
			}//ㅡ
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = 0; j < n - 2; j++) {
					max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2]);
				}
			}
			for(int i = 0; i < n - 2; i++) {
				for(int j = 0; j < n - 1; j++) {
					max = Math.max(max, arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 2][j]);
				}
			}//ㄹ
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = 0; j < n - 2; j++) {
					max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2]);
					max = Math.max(max, arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2]);
				}
			}
			for(int i = 0; i < n - 2; i++) {
				for(int j = 0; j < n - 1; j++) {
					max = Math.max(max, arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1]);
					max = Math.max(max, arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j]);
				}
			}
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = 0; j < n - 2; j++) {
					max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]);
					max = Math.max(max, arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2] + arr[i][j + 1]);
				}
			}
			for(int i = 0; i < n - 2; i++) {
				for(int j = 0; j < n - 1; j++) {
					max = Math.max(max, arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1]);
					max = Math.max(max, arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1]);
				}
			}//ㅗ
			
			for(int i = 0; i < n - 1; i ++) {
				for(int j = 0; j < n - 1; j++) {
					max = Math.max(max, arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1]);
				}
			}//ㅁ
			
			sb.append(idx).append(". ").append(max).append("\n");
			idx++;
		}
		System.out.print(sb);
	}
}
