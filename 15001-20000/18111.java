import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][m];
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m ; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, num[i][j]);
				min = Math.min(min, num[i][j]);
			}
		}
		
		int time = Integer.MAX_VALUE, block = -1;
		for(int i = min; i <= max; i++) {
			int counttime = 0, haveblock = b;
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					int number = num[j][k] - i;
					
					if(number > 0) {
						counttime += Math.abs(number) * 2;
						haveblock += Math.abs(number);
					}
					else if(number < 0) {
						counttime += Math.abs(number);
						haveblock -= Math.abs(number);
					}
				}
			}
			if(haveblock < 0) {
				continue;
			}
			
			if(time >= counttime) {
				time = counttime;
				block = i;
			}
		}
		System.out.print(time + " " + block);
	}
}
