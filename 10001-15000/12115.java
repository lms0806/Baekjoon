import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int[] num = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {				
				if(check(arr[i], num)) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int[] arr, int[] num) {
		for(int i = 0; i < arr.length; i++) {
			if(num[i] != -1 && arr[i] != num[i]) {
				return false;
			}
		}
		return true;
	}
}
