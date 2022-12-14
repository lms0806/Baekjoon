import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 0) {
					list.add(new int[] {i, j});
				}
			}
		}
		
		dfs(0);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean dfs(int idx) {
		if(idx == list.size()) {
			return true;
		}
		else {
			int[] position = list.get(idx);
			
			int x = position[0], y = position[1];
			for(int i = 1; i <= 9; i++) {
				if(check(x, y, i)) {
					arr[x][y] = i;
					
					if(dfs(idx + 1)) {
						return true;
					}
					else {
						arr[x][y] = 0;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean check(int row, int col, int num) {
		for(int i = 0; i < 9; i++) {
			if(arr[i][col] == num || arr[row][i] == num) {
				return false;
			}
		}
		
		int nrow = (row / 3) * 3;
		int ncol = (col / 3) * 3;
		
		for(int i = nrow; i < nrow + 3; i++) {
			for(int j = ncol; j < ncol + 3; j++) {
				if(arr[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}
}
