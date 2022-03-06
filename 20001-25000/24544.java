import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[2][n];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0, answer1 = 0;
		for(int i = 0; i < n; i++) {
			answer += arr[0][i];
			if(arr[1][i] == 0) {
				answer1 += arr[0][i];
			}
		}
		
		System.out.print(answer + "\n" + answer1);
	}
}
