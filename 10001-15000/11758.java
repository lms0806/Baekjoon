import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] arr = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long num = (arr[1][0] - arr[0][0]) * (arr[2][1] - arr[0][1]) - (arr[1][1] - arr[0][1]) * (arr[2][0] - arr[0][0]);
		
		System.out.print(num < 0 ? -1 : num == 0 ? 0 : 1);
	}
}
