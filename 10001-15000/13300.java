import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[2][6];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken()) - 1]++;
		}
		
		int count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 6; j++) {
				count += arr[i][j] / k;
				if(arr[i][j] % k != 0) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}
