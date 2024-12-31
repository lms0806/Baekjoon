import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] count;
	static boolean[][] arr, check;
	static int n, m, r, c, answer = 0, max = 41;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		check = new boolean[max][max];
		count = new int[t];
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			arr = new boolean[max][max];
			
			for(int i = 0; i < r; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < c; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken()) == 1;
				}
			}
			
			if(append()) {
				continue;
			}
			
			for(int i = 0; i < 3; i++) {
				Rotation();
				if(append()) {
					break;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(check[i][j]) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void Rotation() {
		boolean[][] temp = new boolean[max][max];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				temp[i][r - j - 1] = arr[j][i];
			}
		}
		
		for(int i = 0; i < 41; i++) {
			for(int j = 0; j < 41; j++) {
				arr[i][j] = temp[i][j];
			}
		}
		
		int tmp = r;
		r = c;
		c = tmp;
	}
	
	public static boolean append() {
		for(int i = 0; i <= n - r; i++) {
			for(int j = 0; j <= m - c; j++) {
				if(able(i, j)) {
					attach(i, j);
					return true;
				}
			}
		}
		return false;
	}
	
	public static void attach(int x, int y) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(arr[i][j]) {
					check[i + x][j + y] = true;
				}
			}
		}
	}
	
	public static boolean able(int x, int y) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(arr[i][j] && check[i + x][j + y]) {
					return false;
				}
			}
		}
		return true;
	}
}
