import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				int i = Integer.parseInt(st.nextToken()) - 1;
				
				int num = arr[i][n - 1];
				for(int j = 0; j < n; j++) {
					int next = arr[i][j];
					arr[i][j] = num;
					num = next;
				}
			}
			else {
				int[][] arr2 = new int[n][n];
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						arr2[j][n - i - 1] = arr[i][j];
					}
				}
				
				arr = arr2;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int[] ar : arr) {
			for(int a : ar) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
