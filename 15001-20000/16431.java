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
			n[i][0] = Integer.parseInt(st.nextToken());
			n[i][1] = Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int ans = Math.max(Math.abs(n[0][0] - a), Math.abs(n[0][1] - b));
		ans -= Math.abs(n[1][0] - a) + Math.abs(n[1][1] - b);
		
		System.out.print(ans < 0 ? "bessie" : ans == 0 ? "tie" : "daisy");
	}
}
