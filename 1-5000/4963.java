import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int a,b;
	static boolean[][] check;
	static boolean[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 || b == 0) {
				break;
			}
			
			arr = new boolean[b][a];
			check = new boolean[b][a];
			for(int i = 0; i < b; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < a; j++) {
					if(Integer.parseInt(st.nextToken()) == 1) {
						arr[i][j] = true;
					}
				}
			}
			
			int answer = 0;
			for(int i = 0; i < b; i++) {
				for(int j = 0; j < a; j++) {
					if(checktrue(i,j)) {
						answer++;
						bfs(i,j);
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean checktrue(int row, int col) {
		if(row < 0 || row >= b || col < 0 || col >= a || check[row][col] || !arr[row][col]) {
			return false;
		}
		return true;
	}
	
	public static void bfs(int row, int col) {
		check[row][col] = true;
		
		for(int i = row - 1; i <= row + 1; i++) {
			for(int j = col - 1; j <= col + 1; j++) {
				if(checktrue(i, j)) {
					bfs(i, j);
				}
			}
		}
	}
}
