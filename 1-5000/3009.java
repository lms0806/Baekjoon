import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[][] num = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(num[0][0] == num[1][0] ? num[2][0] : num[0][0] == num[2][0] ? num[1][0] : num[0][0]).append(" ");
		sb.append(num[0][1] == num[1][1] ? num[2][1] : num[0][1] == num[2][1] ? num[1][1] : num[0][1]);
		System.out.print(sb);
	}
}
