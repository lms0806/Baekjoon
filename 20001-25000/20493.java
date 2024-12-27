import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			str[i] = st.nextToken();
		}
		
		int x = 0, y = 0;
		int now = 0, idx = 0;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, -1, 0, 1};
		for(int i = 0; i < n; i++) {
			x += dx[idx] * (arr[i] - now);
			y += dy[idx] * (arr[i] - now);
			now = arr[i];
			
			if("right".equals(str[i])) {
				idx++;
				if(idx == dx.length) {
					idx -= dx.length;
				}
			}
			else {
				idx--;
				if(idx < 0) {
					idx += dx.length;
				}
			}
		}
		
		x += dx[idx] * (t - now);
		y += dy[idx] * (t - now);
		
		System.out.print(x + " " + y);
	}
}
