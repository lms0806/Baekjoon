import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] num = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 1; i < n; i++) {
			answer += Math.abs(num[i][0] - num[i - 1][0]) + Math.abs(num[i][1] - num[i - 1][1]);
		}
		System.out.print(answer);
	}
}
