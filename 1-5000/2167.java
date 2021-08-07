import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n + 1][m + 1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken()) + num[i][j - 1] + num[i - 1][j] - num[i - 1][j - 1];
			}
		}
		
		int size = Integer.parseInt(br.readLine());
		
        StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			st = new StringTokenizer(br.readLine());
			int startn = Integer.parseInt(st.nextToken()) - 1, startm = Integer.parseInt(st.nextToken()) - 1;
			int endn = Integer.parseInt(st.nextToken()), endm = Integer.parseInt(st.nextToken());
			
			sb.append(num[endn][endm] - num[endn][startm] - num[startn][endm] + num[startn][startm]).append("\n");
		}
        System.out.print(sb);
	}
}
