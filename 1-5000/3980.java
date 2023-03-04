import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			arr = new int[11][11];
			visited = new boolean[11];
			
			for(int i = 0; i < 11; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 11; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			answer = 0;
			
			dfs(0, 0);
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int depth, int sum) {
		if(depth == 11) {
			answer = Math.max(answer, sum);
			return;
		}
		
		for(int i = 0; i < 11; i++) {
			if(!visited[i] && arr[depth][i] > 0) {
				visited[i] = true;
				dfs(depth + 1, sum + arr[depth][i]);
				visited[i] = false;
			}
		}
	}
}
