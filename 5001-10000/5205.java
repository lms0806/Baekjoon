import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][3];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 3; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			ArrayList<int[]> array = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					int r = (int) Math.pow(arr[i][0] - arr[j][0], 2);
					int g = (int) Math.pow(arr[i][1] - arr[j][1], 2);
					int b = (int) Math.pow(arr[i][2] - arr[j][2], 2);
					int num = (int) Math.sqrt(r + g + b);
					
					if(num > max) {
						array.clear();
						max = num;
					}
					if(num == max) {
						array.add(new int[] {i + 1, j + 1});
					}
				}
			}
			
			sb.append("Data Set ").append(t).append(":").append("\n");
			for(int[] a : array) {
				sb.append(a[0]).append(" ").append(a[1]).append("\n");
			}
		}
		System.out.print(sb);
	}
}
