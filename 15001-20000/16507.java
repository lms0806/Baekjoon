import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][m + 1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int startx = Integer.parseInt(st.nextToken()), starty = Integer.parseInt(st.nextToken());
			int endx = Integer.parseInt(st.nextToken()), endy = Integer.parseInt(st.nextToken());
			
			int sum = arr[endx][endy] - arr[endx][starty -1] - arr[startx - 1][endy] + arr[startx - 1][starty - 1];
			int count = (endx - startx + 1) * (endy - starty + 1);
			
			sb.append(sum / count).append("\n");
		}
		System.out.print(sb);
	}
}
