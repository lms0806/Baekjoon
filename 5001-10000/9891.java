import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[i][0] = Integer.parseInt(st.nextToken()) - a;
			arr[i][1] = Integer.parseInt(st.nextToken()) - b;
		}
		
		int answer = n * (n - 1) / 2;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i][0] <= arr[j][0] && arr[i][1] <= arr[j][1]) {
					answer--;
				}
				else if(arr[i][0] <= arr[j][1] && arr[i][1] <= arr[j][0]) {
					answer--;
				}
				else if(arr[j][0] <= arr[i][0] && arr[j][1] <= arr[i][1]) {
					answer--;
				}
				else if(arr[j][0] <= arr[i][1] && arr[j][1] <= arr[i][0]) {
					answer--;
				}
			}
		}
		System.out.print(answer);
	}
}
