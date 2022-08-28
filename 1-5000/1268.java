import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[][] flag = new boolean[n][n];
		int[][] student = new int[n][5];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				student[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					if(student[j][i] == student[k][i]) {
						flag[k][j] = true;
						flag[j][k] = true;
					}
				}
			}
		}
		
		int max = 0, answer = 1;
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(boolean f : flag[i]) {
				if(f) {
					count++;
				}
			}
			
			if(count > max) {
				max = count;
				answer= i + 1;
			}
		}
		System.out.print(answer);
	}
}
