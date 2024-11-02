import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		int[] s = new int[2], t = new int[2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 5) {
					t[0] = i;
					t[1] = j;
				}
				else if(arr[i][j] == 2) {
					s[0] = i;
					s[1] = j; 
				}
			}
		}
		
		System.out.print(solve(s, t, arr));
	}
	public static int solve(int[] s, int[] t, int[][] arr) {
		if(Math.sqrt(Math.pow(s[0] - t[0], 2) + Math.pow(s[1] - t[1], 2)) < 5) {
			return 0;
		}
		
		int a = Math.min(s[0], t[0]), b = Math.min(s[1], t[1]);
		int c = Math.max(s[0], t[0]), d = Math.max(s[1], t[1]);
		
		int count = 0;
		for(int i = a; i <= c; i++) {
			for(int j = b; j <= d; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		return count >= 3 ? 1 : 0;
	}
}
