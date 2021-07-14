import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[][] num = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			num[0][i] = i;
			num[i][1] = 1;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				num[i][j] = num[i - 1][j] + num[i][j - 1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(num[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.print(sb);
	}
}
