import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] time = new int[1001];
		int[][] arr = new int[n][2];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			for(int j = arr[i][0]; j < arr[i][1]; j++) {
				if(time[j] == 0) {
					sum++;
				}
				time[j]++;
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = arr[i][0]; j < arr[i][1]; j++) {
				if(time[j] <= 1) {
					count++;
				}
			}
			
			min = Math.min(min, count);
		}
		System.out.print(sum - min);
	}
}
