import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int INF = 987654321;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i != j) {
					arr[i][j] = INF;
				}
			}
		}
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1) {
				break;
			}
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			int score = 0;
			for(int j = 1; j <= n; j++) {
				score = Math.max(arr[i][j], score);
			}
			
			if(min > score) {
				answer.clear();
				min = score;
				answer.add(i);
			}
			else if(min == score) {
				answer.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(answer.size()).append("\n");
		for(int a : answer) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
