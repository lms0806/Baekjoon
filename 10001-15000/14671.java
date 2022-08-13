import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] check = new boolean[2][2];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		st.nextToken();
		int t = Integer.parseInt(st.nextToken());
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			check[(a + b) % 2][b % 2] = true;
		}
		System.out.print(solve());
	}
	
	public static String solve() {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				if(!check[i][j]) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
