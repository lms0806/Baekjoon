import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			int maxn = 0, maxm = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				maxn = Math.max(maxn, Integer.parseInt(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				maxm = Math.max(maxm, Integer.parseInt(st.nextToken()));
			}
			
			sb.append(maxn >= maxm ? "S" : "B").append("\n");
		}
		System.out.print(sb);
	}
}
