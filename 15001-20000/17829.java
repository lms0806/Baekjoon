import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
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
		
		System.out.print(solve(0, 0, n));
	}
	
	public static int solve(int x, int y, int n) {
		if(n == 1) {
			return arr[x][y];
		}
		ArrayList<Integer> arr = new ArrayList<>();
		
		int div = n / 2;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				arr.add(solve(x + div * i, y + div * j, div));
			}
		}
		
		Collections.sort(arr);
		
		return arr.get(2);
	}
}
