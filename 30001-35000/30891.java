import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][2];
		
		int minx = Integer.MAX_VALUE, maxx = 0;
		int miny = Integer.MAX_VALUE, maxy = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			minx = Math.min(minx, arr[i][0]);
			maxx = Math.max(maxx, arr[i][0]);
			miny = Math.min(miny, arr[i][1]);
			maxy = Math.max(maxy, arr[i][1]);
		}
		
		int rx = 0, ry = 0, num = -100;
		for(int i = minx; i <= maxx; i++) {
			for(int j = miny; j <= maxy; j++) {
				int count = 0;
				for(int k = 0; k < n; k++) {
					if(Math.sqrt(Math.pow(i - arr[k][0], 2) + Math.pow(j - arr[k][1], 2)) <= r) {
						count++;
					}
				}
				
				if(count > num) {
					num = count;
					rx = i;
					ry = j;
				}
			}
		}
		System.out.print(rx + " " + ry);
	}
}
