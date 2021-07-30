import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int size = Integer.parseInt(br.readLine());
		
		int startn, startm, endn, endm;
        	StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			st = new StringTokenizer(br.readLine());
			startn = Integer.parseInt(st.nextToken());
			startm = Integer.parseInt(st.nextToken());
			endn = Integer.parseInt(st.nextToken());
			endm = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			for(int i = startn - 1; i < endn; i++) {
				for(int j = startm - 1; j < endm; j++) {
					sum += num[i][j];
				}
			}
			sb.append(sum).append("\n");
		}
        	System.out.print(sb);
	}
}
