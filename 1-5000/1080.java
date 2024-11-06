import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m], b = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				a[i][j] = s.charAt(j) - '0';
			}
		}
		
		boolean check = true;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				b[i][j] = s.charAt(j) - '0';
				
				if(check && a[i][j] != b[i][j]) {
					check = false;
				}
			}
		}
		
		System.out.print(solve(a, b));
	}
	
	public static int solve(int[][] a, int[][] b) {
		int answer = 0;
		for(int i = 0; i < a.length - 2; i++) {
			for(int j = 0; j < a[i].length - 2; j++) {
				if(a[i][j] != b[i][j]) {
					change(a, i, j);
					answer++;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					return -1;
				}
			}
		}
		return answer;
	}
	
	public static void change(int[][] arr, int a, int b) {
		for(int i = a; i < a + 3; i++) {
			for(int j = b; j < b + 3; j++) {
				arr[i][j] = arr[i][j] == 1 ? 0 : 1;
			}
		}
	}
}
