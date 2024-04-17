import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int a = 0, b = 0;
		long min = Long.MAX_VALUE;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				long rss = 0;
				for(int k = 0; k < n; k++) {
					rss += Math.pow(i * arr[k][0] + j - arr[k][1], 2);
				}
				
				if(min > rss) {
					min = rss;
					a = i;
					b = j;
				}
			}
		}
		
		System.out.print(a + " " + b);
	}
}
