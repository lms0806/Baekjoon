import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[][] flag = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			for(int j = 0; j < n; j++) {
				if(s.charAt(j) == '1') {
					flag[i][j] = true;
				} 
			}
		}
		
		int answer = 0;
		for(int i = n - 1; i >= 0; i--) {
			for(int j = n - 1; j >= 0; j--) {
				if(flag[i][j]) {
					for(int k = 0; k <= i; k++) {
						for(int l = 0; l <= j; l++) {
							flag[k][l] = !flag[k][l];
						}
					}
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
