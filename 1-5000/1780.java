import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] answer = new int[3];
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve(0, 0, n);
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void solve(int x, int y, int n) {		
		if(check(x, y, n)) {
			answer[arr[x][y] + 1]++;
		}
		else {
			int div = n / 3;
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					solve(x + div * i, y + div * j, div);
				}
			}
		}
	}
	
	public static boolean check(int x, int y, int n) {
		for(int i = x; i < x + n; i++) {
			for(int j = y; j < y + n; j++) {
				if(arr[x][y] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
