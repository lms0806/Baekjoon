import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][4];
		boolean[] flag = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()) - 1;
			for(int j = 0; j < 4; j++) {
				arr[num][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] answer = new int[4];
		for(int i = 0; i < 4; i++) {
			int idx = 0;
			for(int j = 0; j < n; j++) {
				if(!flag[j]) {
					idx = j;
					break;
				}
			}
			
			for(int j = idx + 1; j < n; j++) {
				if(arr[idx][i] < arr[j][i] && !flag[j]) {
					idx = j;
				}
			}
			flag[idx] = true;
			answer[i] = idx + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
