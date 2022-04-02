import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = 0;
		for(int i = 0; i < m; i++) {
			for(int j = i + 1; j < m; j++) {
				boolean flag = true;
				for(int k = 0; k < n; k++) {
					for(int l = k + 1; l < n; l++) {
						if(arr[i][k] < arr[i][l] && arr[j][k] < arr[j][l]) {
							continue;
						}
						else if(arr[i][k] == arr[i][l] && arr[j][k] == arr[j][l]) {
							continue;
						}
						else if(arr[i][k] > arr[i][l] && arr[j][k] > arr[j][l]) {
							continue;
						}
						else {
							flag = false;
							break;
						}
					}
					if(!flag) {
						break;
					}
				}
				
				if(flag) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
