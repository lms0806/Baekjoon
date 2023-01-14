import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			int sum = 0;
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(i == 0) {
						sum += arr[i][j];
					}
				}
			}
			
			sb.append(solve(n, arr, sum)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int n, int[][] arr, int sum) {
		String answer = "Not a magic square";
		
		for(int i = 0; i < n; i++) {
			int count = 0, count1 = 0;
			for(int j = 0; j < n; j++) {
				count += arr[i][j];
				count1 += arr[j][i];
			}
			
			if(sum != count || sum != count1) {
				return answer;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			count += arr[i][i];
		}
		
		if(count != sum) {
			return answer;
		}
		
		count = 0;
		for(int i = 0; i < n; i++) {
			count += arr[i][n - i - 1];
		}
		
		if(count != sum) {
			return answer;
		}
		
		return "Magic square of size " + n;
	}
}
