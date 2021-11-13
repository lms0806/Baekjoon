import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[2][3];
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		int age = arr[1][0] - arr[0][0];
		if(arr[1][1] < arr[0][1]) {
			age--;
		}
		else if(arr[1][1] == arr[0][1]) {
			if(arr[1][2] < arr[0][2]) {
				age--;
			}
		}
		sb.append(age).append("\n");
		sb.append(arr[1][0] - arr[0][0] + 1).append("\n");
		sb.append(arr[1][0] - arr[0][0]);
		
		System.out.print(sb);
	}
}
