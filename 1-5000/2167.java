import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int size = Integer.parseInt(br.readLine());
		int startn, startm, endn, endm;
		for(int i = 0; i < size; i++) {
			String[] str = br.readLine().split(" ");
			startn = Integer.parseInt(str[0]);
			startm = Integer.parseInt(str[1]);
			endn = Integer.parseInt(str[2]);
			endm = Integer.parseInt(str[3]);
			
			int sum = 0;
			for(int j = startn-1; j < endn; j++) {
				for(int k = startm-1; k < endm; k++) {
					sum += num[j][k];
				}
			}
			System.out.println(sum);
		}
	}
}
