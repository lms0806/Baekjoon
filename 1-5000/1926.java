import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int a, b, count;
	static boolean[][] check;
	static boolean[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		arr = new boolean[a][b];
		check = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					arr[i][j] = true;
				}
			}
		}
		
		int answer = 0, max = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(checktrue(i,j)) {
					answer++;
					bfs(i,j);
					max = Math.max(count, max);
					count = 0;
				}
			}
		}
		System.out.print(answer + "\n" + max);
	}
	
	public static boolean checktrue(int row, int col) {
		if(row < 0 || row >= a || col < 0 || col >= b || check[row][col] || !arr[row][col]) {
			return false;
		}
		return true;
	}
	
	public static void bfs(int row, int col) {
		check[row][col] = true;
		
		count++;
		
		if(checktrue(row - 1, col)) {
			bfs(row - 1, col);
		}
		if(checktrue(row, col - 1)) {
			bfs(row, col - 1);
		}
		if(checktrue(row, col + 1)) {
			bfs(row, col + 1);
		}
		if(checktrue(row + 1, col)) {
			bfs(row + 1, col);
		}
	}
}
