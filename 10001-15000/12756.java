import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] a = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(solve(a));
	}
	
	public static String solve(int[][] a) {
		while(true) {
			a[0][1] -= a[1][0];
			a[1][1] -= a[0][0];
			
			if(a[1][1] <= 0 && a[0][1] > 0) {
				return "PLAYER A";
			}
			else if(a[0][1] <= 0 && a[1][1] > 0) {
				return "PLAYER B";
			}
			else if(a[0][1] > 0 && a[0][1] > 0) {
				continue;
			}
			else {
				return "DRAW";
			}
		}
	}
}
