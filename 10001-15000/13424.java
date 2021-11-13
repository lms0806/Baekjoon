import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int INF = 987654231;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n + 1][n + 1];
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i != j) {
						arr[i][j] = INF;
					}
				}
			}
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				int cost = Integer.parseInt(st.nextToken());
				
				arr[a][b] = cost;
				arr[b][a] = cost;
			}
			
			int d = Integer.parseInt(br.readLine());
			ArrayList<Integer> arrs = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			while(d --> 0) {
				arrs.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int k = 1; k <= n; k++) {
				for(int i = 1; i <= n; i++) {
					for(int j = 1; j <= n; j++) {
						arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
					}
				}
			}
			
			int answer = 0, min = INF;
			for(int i = 1; i <= n; i++) {
				int sum = 0;
				for(int j = 0; j < arrs.size(); j++) {
					sum += arr[i][arrs.get(j)];
				}
				if(sum < min) {
					min = sum;
					answer = i;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}
