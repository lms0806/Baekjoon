import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(Math.abs(arr[i][0] - arr[j][0]) < a && Math.abs(arr[i][1] - arr[j][1]) < b) {
					answer = Math.max(answer, Math.abs(arr[i][2] - arr[j][2]));
				}
			}
		}
		System.out.print(answer);
	}
}
