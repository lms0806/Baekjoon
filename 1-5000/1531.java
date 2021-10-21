import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[100][100];
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			int a1 = Integer.parseInt(st.nextToken()), b1 = Integer.parseInt(st.nextToken());
			
			for(int i = a; i < a1; i++) {
				for(int j = b; j < b1; j++) {
					num[i][j]++;
				}
			}
		}
		
		int answer = 0;
		for(int[] a : num) {
			for(int b : a) {
				if(b > m) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
