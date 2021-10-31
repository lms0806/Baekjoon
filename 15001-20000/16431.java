import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] n = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n[i][0] = atoi(st.nextToken());
			n[i][1] = atoi(st.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = atoi(st.nextToken()), b = atoi(st.nextToken());
		
		int ans = Math.max(abs(n[0][0] - a), abs(n[0][1] - b));
		ans -= abs(n[1][0] - a) + abs(n[1][1] - b);
		
		System.out.print(ans < 0 ? "bessie" : ans == 0 ? "tie" : "daisy");
	}
	
	public static int atoi(String s) {
		return Integer.parseInt(s);
	}
	public static int abs(int n) {
		return Math.abs(n);
	}
}
