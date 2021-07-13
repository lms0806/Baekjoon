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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		arr = new boolean[b][a];
		check = new boolean[b][a];
		for(int i = 0; i < a; i++) {
			String str = br.readLine();
			for(int j = 0; j < b; j++) {
				if(str.charAt(j) == '*') {
					arr[j][i] = true;
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
		
		System.out.print(answer);
	}
	
	public static boolean checktrue(int row, int col) {
		if(row < 0 || row >= b || col < 0 || col >= a || check[row][col] || !arr[row][col]) {
			return false;
		}
		return true;
	}
	
	public static void bfs(int row, int col) {
		check[row][col] = true;
		
		if(checktrue(row - 1, col)) {
			bfs(row - 1, col);
		}
		if(checktrue(row, col - 1)) {
			bfs(row, col - 1);
		}
		if(checktrue(row + 1, col)) {
			bfs(row + 1, col);
		}
		if(checktrue(row, col + 1)) {
			bfs(row, col + 1);
		}
	}
}
