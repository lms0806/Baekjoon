import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int[][] num = new int[9][9];
			
			for(int j = 0; j < 9; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k = 0; k < 9; k++) {
					num[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			if(i < size) {
				br.readLine();
			}
			
			sb.append("Case ").append(i).append(": ").append(solve(num) ? "CORRECT" : "INCORRECT").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int[][] num) {
		for(int i = 0; i < 9; i++) {
			boolean[] visited = new boolean[10];
			for(int j = 0; j < 9; j++) {
				if(visited[num[i][j]]) {
					return false;
				}
				visited[num[i][j]] = true;
			}
		}
		
		for(int i = 0; i < 9; i++) {
			boolean[] visited = new boolean[10];
			for(int j = 0; j < 9; j++) {
				if(visited[num[j][i]]) {
					return false;
				}
				visited[num[j][i]] = true;
			}
		}
		
		int[] dx = {0, 0, 0, 3, 3, 3, 6, 6, 6};
		int[] dy = {0, 3, 6, 0, 3, 6, 0, 3, 6};
		for(int i = 0; i < 9; i++) {
			boolean[] visited = new boolean[10];
			for(int j = dx[i]; j < dx[i] + 3; j++) {
				for(int k = dy[i]; k < dy[i] + 3; k++) {
					if(visited[num[j][k]]) {
						return false;
					}
					visited[num[j][k]] = true;
				}
			}
		}
		
		return true;
	}
}
