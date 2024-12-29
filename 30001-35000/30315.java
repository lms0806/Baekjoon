import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		double answer = Double.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			double sum = 0;
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				
				sum += Math.sqrt(Math.pow(arr[i][0] - arr[j][0], 2) + Math.pow(arr[i][1] - arr[j][1], 2));
			}
			
			sum /= (n - 1);
			
			answer = Math.min(answer, sum);
		}
		System.out.print(answer);
	}
}
