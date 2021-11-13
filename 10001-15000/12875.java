import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) {
					arr[i][j] = 987654321;
				}
			}
		}
		
		char[][] ch = new char[n][n];
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
			for(int j = 0; j < n; j++) {
				if(ch[i][j] == 'Y') {
					arr[i][j] = 1;
				}
			}
		}
		
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				answer = Math.max(answer, arr[i][j]);
			}
		}
		
		System.out.println(answer == 987654321 ? -1 : answer * d);
	}
}
