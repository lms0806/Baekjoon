import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		int answer = 0;
		int[] num = new int[10001];
		for(int i = 0; i < n; i++) {
			answer += arr[i][0] - num[arr[i][1]];
			answer += arr[i][0] - num[arr[i][2] - 1];
			
			for(int j = arr[i][1]; j < arr[i][2]; j++) {
				num[j] = arr[i][0];
			}
		}
		System.out.print(answer);
	}
}
