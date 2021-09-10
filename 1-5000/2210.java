import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] visited = new boolean[5][5];
	static int[][] num = new int[5][5];
	static int[] dy={1, -1, 0, 0}, dx = {0, 0, 1, -1};
	static HashSet<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				dfs(i, j, 0, num[i][j]);
			}
		}
		
		System.out.print(set.size());
	}
	
	public static void dfs(int index, int depth, int count, int sum) {
		if(count == 5) {
			set.add(sum);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int x = index + dx[i], y = depth + dy[i];
			
			if(x < 0 || x > 4 || y < 0 || y > 4) {
				continue;
			}
			
			dfs(x, y, count + 1, sum * 10 + num[x][y]);
		}
	}
}
