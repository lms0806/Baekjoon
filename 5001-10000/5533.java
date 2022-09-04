import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		int[] score = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k = 0; k < n; k++) {
					if(j == k) {
						continue;
					}
					
					if(arr[j][i] == arr[k][i]) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					score[j] += arr[j][i];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int s : score) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
