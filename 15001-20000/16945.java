import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr = new int[3][3];
	static int answer = Integer.MAX_VALUE;
	static boolean[] check = new boolean[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int sum) {
		if(depth == 9 && check()) {
			answer = Math.min(answer, sum);
			return;
		}
		
		int x = depth / 3, y = depth % 3;
		
		for(int i = 1; i <= 9; i++) {
			if(!check[i]) {
				int num = arr[x][y];
				check[i] = true;
				arr[x][y] = i;
				dfs(depth + 1, sum + Math.abs(num - i));
				check[i] = false;
				arr[x][y] = num;
			}
		}
	}
	
	public static boolean check() {
		if(arr[0][0] + arr[0][1] + arr[0][2] != 15 || arr[1][0] + arr[1][1] + arr[1][2] != 15 || arr[2][0] + arr[2][1] + arr[2][2] != 15) {
			return false;
		}
		
		if(arr[0][0] + arr[1][0] + arr[2][0] != 15 || arr[0][1] + arr[1][1] + arr[2][1] != 15 || arr[0][2] + arr[1][2] + arr[2][2] != 15) {
			return false;
		}
		
		if(arr[0][0] + arr[1][1] + arr[2][2] != 15 || arr[0][2] + arr[1][1] + arr[2][0] != 15) {
			return false;
		}
		
		return true;
	}
}
