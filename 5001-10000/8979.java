import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][4];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.print(solve(num, k));
	}
	
	public static int solve(int[][] num, int k) {
		int rank = 1, check = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i][0] == k) {
				check = i;
			}
		}
		
		for(int[] n : num) {
			if(n[1] > num[check][1]) {
				rank++;
			}
			else if(n[1] == num[check][1]){
				if(n[2] > num[check][2]) {
					rank++;
				}
				else if(n[2] == num[check][2] && n[3] > num[check][3]) {
					rank++;
				}
			}
		}
		return rank;
	}
}
