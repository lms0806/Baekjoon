import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		int x = 0, y = 0;
		for(int i = 0; i < n - 3; i++) {
			for(int j = 0; j < m - 3; j++) {
				int sum = sum(i, j);
				if(answer < sum) {
					answer = sum;
					x = i + 1;
					y = j + 1;
				}
			}
		}
		System.out.print(answer + "\n" + x + " " + y);
	}
	
	public static int sum(int x, int y) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum += arr[x + i][y + j];
			}
		}
		return sum;
	}
}
