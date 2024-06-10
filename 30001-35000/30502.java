import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][2];
		
		for(int i = 1; i <= n; i++) {
			Arrays.fill(arr[i], -1);
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = st.nextToken().charAt(0) == 'P' ? 0 : 1;
			int c = Integer.parseInt(st.nextToken());
			
			arr[a][b] = c;
		}
		
		int min = 0, max = 0;
		for(int i = 1; i <= n; i++) {
			if(arr[i][0] == 1 && arr[i][1] == 0) {
				min++;
			}
			
			if(arr[i][0] != 0 && arr[i][1] != 1) {
				max++;
			}
		}
		System.out.print(min + " " + max);
	}
}
