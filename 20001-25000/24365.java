import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[3][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = i;
		}
		
		int avg = (arr[0][0] + arr[1][0] + arr[2][0]) / 3;
		
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 3; j++) {
				if(arr[i][0] > arr[j][0]) {
					int temp = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp;
				}
			}
		}
		
		System.out.print(Math.abs(arr[2][1] - arr[0][1]) * (avg - arr[0][0]) + Math.abs(arr[2][1] - arr[1][1]) * (avg - arr[1][0]));
	}
}
