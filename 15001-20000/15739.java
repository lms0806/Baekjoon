import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] num = new int[n][n];

		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		n = n * (n * n + 1) / 2;
		
		System.out.print(solve(n, num));
	}
	
	public static String solve(int n, int[][] num) {
		int[] check = new int[n];
		for(int i = 0; i < num.length; i++) {
			int sum = 0;
			for(int j = 0; j < num.length; j++) {
				sum += num[i][j];
				check[num[i][j] - 1]++;
				if(check[num[i][j] - 1] > 1) {
					return "FALSE";
				}
			}
			if(sum != n) {
				return "FALSE";
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			int sum = 0;
			for(int j = 0; j < num.length; j++) {
				sum += num[j][i];
			}
			if(sum != n) {
				return "FALSE";
			}
		}
		
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i][i];
		}
		if(sum != n) {
			return "FALSE";
		}
		
		sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i][num.length - i - 1];
		}
		if(sum != n) {
			return "FALSE";
		}
		
		return "TRUE";
	}
}
