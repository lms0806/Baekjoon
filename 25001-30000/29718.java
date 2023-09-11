import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		int[] sum = new int[m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				sum[i] += arr[j][i];
			}
		}
		
		int a = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i <= m - a; i++) {
			int temp = 0;
			for(int j = i; j < i + a; j++) {
				temp += sum[j];
			}
			answer = Math.max(answer, temp);
		}
		System.out.print(answer);
	}
} 
