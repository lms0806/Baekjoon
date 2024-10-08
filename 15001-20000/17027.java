import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= 3; i++) {
			int now = i, count = 0;
			for(int j = 0; j < n; j++) {
				int a = arr[j][0], b = arr[j][1], g = arr[j][2];
				
				if(now == a) {
					now = b;
				}
				else if(now == b) {
					now = a;
				}
				
				if(now == g) {
					count++;
				}
			}
			
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
